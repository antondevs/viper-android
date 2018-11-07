package com.kotlin.viper.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.viper.application.AppComponent
import com.kotlin.viper.services.App
import javax.inject.Inject

abstract class BaseActivity<P : Any> : AppCompatActivity() {

    @Inject
    protected lateinit var presenter: P

    protected abstract fun injectDagger()
    protected abstract fun getXmlLayout(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getXmlLayout())
        this.injectDagger()
        this.attachView()
    }

    protected abstract fun attachView()
    protected abstract fun detachView()

    public override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.detachView()
    }

    protected val appComponent: AppComponent?
        get() {
            val application = application as App
            return application.appComponent
     }

}