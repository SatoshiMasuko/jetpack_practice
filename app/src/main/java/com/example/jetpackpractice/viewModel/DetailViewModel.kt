package com.example.jetpackpractice.viewModel

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.example.jetpackpractice.model.ApiService
import com.example.jetpackpractice.model.Issues
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch

class DetailViewModel(application: Application): BaseViewModel(application) {
    val articleItems = ObservableField<Issues>()
}