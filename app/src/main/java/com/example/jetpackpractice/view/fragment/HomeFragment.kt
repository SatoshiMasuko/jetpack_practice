package com.example.jetpackpractice.view.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.transition.TransitionInflater
import com.example.jetpackpractice.R
import com.example.jetpackpractice.databinding.IssuesItemBinding
import com.example.jetpackpractice.model.Issues
import com.example.jetpackpractice.util.DateTimeUtil
import com.example.jetpackpractice.view.adapter.IssuesListAdapter
import com.example.jetpackpractice.viewModel.IssuesViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.issues_item.*


class HomeFragment : Fragment() {

    private val issuesListAdapter = IssuesListAdapter(arrayListOf())
    //Android KTX
    private val viewModel : IssuesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.display()

        //adapterのセット
        issuesList.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = issuesListAdapter
        }
        //上スワイプでページ更新
        refreshLayout.setOnRefreshListener {
            issuesList.visibility = View.GONE
            listError.visibility = View.GONE
            loadingView.visibility = View.GONE
            viewModel.display()
            refreshLayout.isRefreshing = false
        }

        observeViewModel()
        DateTimeUtil().backGroundSelect(home_background)

    }
    private fun observeViewModel(){
        viewModel.issues.observe(viewLifecycleOwner, Observer { issues ->
            issues?.let {
                issuesList.visibility = View.VISIBLE
                issuesListAdapter.update(issues)
                issuesListAdapter.setOnItemClickListener(object:IssuesListAdapter.OnItemClickListener{
                    override fun onItemClickListener(view: View, position: Int) {

                        //　User型を渡すことが出来ず、roomも対応していなそうなので無理矢理プリミティブ型にしてsafeargsで渡す。
                        //　できればもっと良い形に書き換えたい

                        val title = issues[position].title.toString()
                        val body = issues[position].body.toString()
                        val userImageUrl = issues[position].user?.profile_image_url.toString()
                        val createdDate = issues[position].created_at.toString()
                        val userName = issues[position].user?.name.toString()

                        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(title,createdDate,body,userImageUrl,userName)
                        findNavController().navigate(action)
                    }
                })
            }
        })
        viewModel.loadingError.observe(viewLifecycleOwner, Observer { isError ->
            isError.let{
                loadingView.visibility = if(it) View.VISIBLE else View.GONE
                if(it){
                    listError.visibility = View.GONE
                    issuesList.visibility = View.GONE
                }
            }
        })
        viewModel.loading.observe(viewLifecycleOwner, Observer { isLoading ->
            isLoading?.let{
                loadingView.visibility = if(it) View.VISIBLE else View.GONE
                if(it){
                    listError.visibility = View.GONE
                    issuesList.visibility = View.GONE
                }
            }
        })
    }
}