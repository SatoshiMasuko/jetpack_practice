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
import com.example.jetpackpractice.R
import com.example.jetpackpractice.databinding.FragmentDetailBinding
import com.example.jetpackpractice.viewModel.DetailViewModel
import com.example.jetpackpractice.viewModel.IssuesViewModel

class DetailFragment : Fragment() {

//    private val args : DetailFragmentArgs by navArgs()
    private lateinit var mBinding: FragmentDetailBinding
    companion object{
        fun newInstance() = DetailFragment()
    }

//    private lateinit var viewModel: DetailViewModel
    private val viewModel: IssuesViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(R.layout.fragment_detail,container,false)
        mBinding = FragmentDetailBinding.inflate(inflater, container, false)
//        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        return mBinding.root
    }
//    private fun initViewModel(){
//        mBinding.issues = viewModel
//        viewModel.articleItems.set(args.articleInformation)
//
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        initViewModel()
        mBinding.executePendingBindings()
    }

}