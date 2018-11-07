package com.kotlin.viper.services

import android.app.Application
import com.kotlin.viper.application.AppComponent
import com.kotlin.viper.application.DaggerAppComponent

class App : Application() {


    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .androidModule(AndroidModule(this))
            .apiModule(ApiModule())
            .build()
    }

}