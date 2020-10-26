package com.example.jetpackpractice.view.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.transition.TransitionInflater
import com.example.jetpackpractice.R
import com.example.jetpackpractice.databinding.IssuesItemBinding
import com.example.jetpackpractice.model.Issues
import com.example.jetpackpractice.view.adapter.IssuesListAdapter
import com.example.jetpackpractice.viewModel.IssuesViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.issues_item.*

class HomeFragment : Fragment() {

    var title = String
    var body = String
    var createdDate = String


//    private lateinit var viewModel: IssuesViewModel
    private val issuesListAdapter = IssuesListAdapter(arrayListOf())
    private val viewModel: IssuesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.display()
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

        issuesList.setOnClickListener { view ->

        }
        observeViewModel()
    }
    private fun observeViewModel(){
        viewModel.issues.observe(viewLifecycleOwner, Observer { issues ->
            issues?.let {
                issuesList.visibility = View.VISIBLE
                issuesListAdapter.update(issues)
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