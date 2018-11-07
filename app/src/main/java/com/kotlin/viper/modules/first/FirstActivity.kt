package com.kotlin.viper.modules.first

import com.kotlin.viper.R
import com.kotlin.viper.common.BaseActivity

class FirstActivity : BaseActivity<FirstPresenter>(), IFirstView.View {

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