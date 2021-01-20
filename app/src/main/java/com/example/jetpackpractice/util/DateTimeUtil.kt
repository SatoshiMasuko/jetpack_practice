package com.example.jetpackpractice.util

import android.content.Context
import android.media.Image
import android.view.View
import android.widget.ImageView
import com.example.jetpackpractice.R
import kotlinx.android.synthetic.main.fragment_calculate.*

import java.text.SimpleDateFormat
import java.util.*
class DateTimeUtil {

    fun backGroundSelect(imageView: ImageView){

        val dateObj = Date()
        val format = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
        val display = format.format(dateObj)

        when(display.substring(5, 7)){
            "12","01","02" -> imageView.setImageResource(R.drawable.winter_image2)
            "03","04","05" -> imageView.setImageResource(R.drawable.spring_image)
            "06","07","08" -> imageView.setImageResource(R.drawable.summer_image)
            "09","10","11" -> imageView.setImageResource(R.drawable.autumn_image)
        }
    }
}



