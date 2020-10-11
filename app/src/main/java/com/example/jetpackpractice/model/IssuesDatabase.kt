package com.example.jetpackpractice.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = arrayOf(Issues::class), version = 1)
//abstract class IssuesDatabase:RoomDatabase() {
//    abstract fun dogDat():IssueDataObject
//
//    companion object{
//        @Volatile private var instance: IssuesDatabase? = null
//        private val LOCK = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
//            instance ?: buildDatabase(context).also {
//                instance = it
//            }
//        }
//        private fun buildDatabase(context: Context) = Room.databaseBuilder(
//            context.applicationContext,
//            IssuesDatabase::class.java,
//            "issuesdatabase"
//        ).build()
//    }
//}