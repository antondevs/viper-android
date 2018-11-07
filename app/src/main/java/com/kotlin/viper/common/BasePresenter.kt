package com.kotlin.viper.common

import javax.inject.Inject

open class BasePresenter<V : IBaseView, I : BaseInteractor> {

    protected var view: V? = null

    @Inject
    protected lateinit var interactor: I

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

}