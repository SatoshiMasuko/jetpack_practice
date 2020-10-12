package com.example.jetpackpractice.viewModel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.jetpackpractice.Prefix
import com.example.jetpackpractice.model.ApiService
import com.example.jetpackpractice.model.Issues

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch

class IssuesViewModel(application: Application): BaseViewModel(application) {

    private val issuesApiService = ApiService()
    private val disposable = CompositeDisposable()

    val issues = MutableLiveData<List<Issues>>()
    val loadingError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()



    fun display(){
        getIssuesApi()
    }

    private fun getIssuesApi(){
        //非同期でAPIを取得する
        loading.value= true
        disposable.add(
            issuesApiService.getApi()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<Issues>>(){
                    override fun onSuccess(issuesList: List<Issues>) {
                        issues.value = issuesList
                        loadingError.value = false
                        loading.value = false
                    }
                    override fun onError(e: Throwable) {
                        loadingError.value = true
                        loading.value = false
                        e.printStackTrace()
                    }
                })
        )
    }
    //Roomからデータを取得したり保存したり
    //Roomがオブジェクト型をサポートしておらず、Userクラスの値を扱えていないため一旦コメントアウト


//    private fun getIssuesFromDatabase(){
//        loading.value = true
//        launch {
//            val issues = IssuesDatabase(getApplication()).issuesDao().getAllIssues()
//
//        }
//    }
//    private fun issuesRetrieved(issuesList: List<Issues>){
//        issues.value = issuesList
//        loadingError.value = false
//        loading.value = false
//    }
//    private fun storeIssuesLocally(list: List<Issues>){
//        launch {
//            val dao = IssuesDatabase(getApplication()).issuesDao()
//            dao.deleteAllIssues()
//            val result = dao.insertAll(*list.toTypedArray())
//            var i = 0
//            while(i < list.size){
//                list[i].uuid = result[i].toInt()
//                ++i
//            }
//            issuesRetrieved(list)
//        }
//    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}