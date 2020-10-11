package com.example.jetpackpractice.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

//@Dao
//interface IssueDataObject {
//    @Insert
//    suspend fun insertAll(vararg issues: Issues): List<Long>
//
//    @Query("SELECT * FROM issues")
//    suspend fun getAllIssues(): List<Issues>
//
//    @Query("SELECT * FROM issues WHERE uuid = :issueId")
//    suspend fun getIssue(issueId: Int): Issues
//
//    @Query("DELETE FROM issues")
//    suspend fun deleteAllIssues()
//}