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
import com.example.jetpackpractice.databinding.FragmentDetailBinding
import com.example.jetpackpractice.util.loadImage
import com.example.jetpackpractice.viewModel.DetailViewModel
import com.example.jetpackpractice.viewModel.IssuesViewModel
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private val args : DetailFragmentArgs by navArgs()
    private lateinit var mBinding: FragmentDetailBinding
    companion object{
        fun newInstance() = DetailFragment()
    }

    private val viewModel: IssuesViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        article_title.text = args.title
//        print(args.title)
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        mBinding.executePendingBindings()
    }

}