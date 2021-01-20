package com.example.jetpackpractice.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

/**
 * ①CoroutineScopeを継承する
 * CoroutineScopeを継承することで、Coroutineを作成することができるようになる。
 * (coroutineBuilderを利用できるようになる）
 */

abstract class BaseViewModel(application: Application): AndroidViewModel(application),CoroutineScope {

    /**
     * ②Jobを作成する。
     * ここでインスタンス化し、coroutineContextに加えることで
     * このViewModelで実行している全てのJobをキャンセルできる。
     * onCleared(viewModelが死ぬタイミングで呼ばれるメソッド)でjobのキャンセルを行う場合が多い
     * (死んだ後はコルーチンに参照できなくなっちゃう)
     */

    private val job = Job()

    /**
     * ③coroutineが実際に動作するcoroutineContextを作成する。
     * Dispatchers.MainとJobは共にCoroutineContextを継承しており、
     * また、coroutineContextはplusオペレータをoverrideして実装しているため足すことができる
     */

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    /**
     * ⑤onCleared()でjobをキャンセルする
     * ViewModelが死ぬタイミングで全てのコルーチンはキャンセルしておく。
     */

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}