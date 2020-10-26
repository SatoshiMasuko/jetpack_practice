package com.example.jetpackpractice.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpackpractice.R
import com.example.jetpackpractice.databinding.IssuesItemBinding
import com.example.jetpackpractice.model.Issues
import com.example.jetpackpractice.view.fragment.HomeFragment
import com.example.jetpackpractice.view.fragment.HomeFragmentDirections

class IssuesListAdapter(val issuesList: ArrayList<Issues>): RecyclerView.Adapter<IssuesListAdapter.IssuesViewHolder>() {

    fun update(newIssueList: List<Issues>){
        issuesList.clear()
        issuesList.addAll(newIssueList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IssuesViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<IssuesItemBinding>(inflater, R.layout.issues_item,parent,false)
        return IssuesViewHolder(view)
    }

    override fun onBindViewHolder(holder: IssuesViewHolder, position: Int) {
        holder.view.issues = issuesList[position]

    }

    override fun getItemCount()= issuesList.size


    class IssuesViewHolder(var view: IssuesItemBinding): RecyclerView.ViewHolder(view.root)
}

//holder.itemView.setOnClickListener { view ->
//    val title = issuesList[position].title.toString()
//    val body = issuesList[position].body.toString()
//    val createdDate = issuesList[position].created_at.toString()
//
//    findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(title,body,createdDate))
//}