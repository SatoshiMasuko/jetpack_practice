package com.example.jetpackpractice.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.example.jetpackpractice.R

import com.example.jetpackpractice.util.displayLocalImage
import com.example.jetpackpractice.util.loadImage
import com.example.jetpackpractice.viewModel.IssuesViewModel
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {



    private val args : DetailFragmentArgs by navArgs()

//    private val title: String by lazy {
//        args.title
//    }
//    private val body: String by lazy {
//        args.body
//    }
//    private val createdAt: String by lazy {
//        args.created
//    }
//    private val userImage: String by lazy{
//        args.image
//    }
//    private val userName: String by lazy{
//        args.name
//    }

    companion object{
        fun newInstance() = DetailFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        mBinding.executePendingBindings()

        val title = args.title
        val body = args.body
        val createdAt = args.created
        val userImage = args.image
        val userName = args.name

        article_title.text = title
        article_body.text = body
        updated_date.text = createdAt
        user_name.text = userName
        displayLocalImage(user_image,userImage)

    }

}