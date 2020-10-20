package com.example.jetpackpractice.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.example.jetpackpractice.R
import com.example.jetpackpractice.databinding.FragmentDetailBinding
import com.example.jetpackpractice.viewModel.DetailViewModel

class DetailFragment : Fragment() {

//    private val args : DetailFragmentArgs by navArgs()
    private lateinit var mBinding: FragmentDetailBinding
    companion object{
        fun newInstance() = DetailFragment()
    }

    private lateinit var viewModel: DetailViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentDetailBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
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