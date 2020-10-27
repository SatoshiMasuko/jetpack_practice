package com.example.jetpackpractice.view.activity

import android.R
import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.stephentuso.welcome.*

class TutorialActivity() : WelcomeActivity() {

    companion object {
        fun showIfNeeded(activity: Activity, savedInstanceState: Bundle?){
            WelcomeHelper(activity, TutorialActivity::class.java).show(savedInstanceState)
        }
    }


    override fun configuration(): WelcomeConfiguration {
        return WelcomeConfiguration.Builder(this)
            .defaultBackgroundColor(BackgroundColor(Color.RED))
            .page(TitlePage(R.drawable.alert_dark_frame, "Title"))
            .page(BasicPage(
                android.R.drawable.ic_delete,
                "Basic page 1",
                "hogehoge")
                .background(BackgroundColor(Color.GREEN)))
            .page(
                BasicPage(
                R.drawable.ic_btn_speak_now,
                "Basic page 2",
                "fugafuga")
                .background(BackgroundColor(Color.BLUE))
            )
            .swipeToDismiss(true)
            .build()
    }
}

