package com.kotlin.viper.modules.second

import com.kotlin.viper.R
import com.kotlin.viper.common.BaseActivity

class SecondActivity : BaseActivity<SecondPresenter>(), ISecondView.View {

    override fun injectDagger() {
        appComponent?.inject(this)
    }

    override fun getXmlLayout(): Int {
        return R.layout.activity_first
    }

    override fun attachView() {
        presenter.attachView(this)
    }

    override fun detachView() {
        presenter.detachView()
    }

}