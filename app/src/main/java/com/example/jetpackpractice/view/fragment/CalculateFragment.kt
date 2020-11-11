package com.example.jetpackpractice.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.jetpackpractice.R
import com.example.jetpackpractice.util.DateTimeUtil
import kotlinx.android.synthetic.main.fragment_calculate.*
import okhttp3.internal.Util
import java.text.SimpleDateFormat
import java.util.*


class CalculateFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_calculate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DateTimeUtil().backGroundSelect(back_ground)
    }

//    private fun backGroundSelect(){
//
////        val image = back_ground
//
//        val dateObj = Date()
//        val format = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
//        val display = format.format(dateObj)
//
//        when(display.substring(5, 7)){
//            "12","01","02" -> back_ground?.setImageResource(R.drawable.winter_image)
//            "03","04","05" -> back_ground?.setImageResource(R.drawable.spring_image)
//            "06","07","08" -> back_ground?.setImageResource(R.drawable.summer_image)
//            "09","10","11" -> back_ground?.setImageResource(R.drawable.winter_image)
//        }
//
//
//
//    }
}