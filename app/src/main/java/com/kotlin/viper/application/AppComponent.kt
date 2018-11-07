package com.kotlin.viper.application

import com.kotlin.viper.modules.first.FirstActivity
import com.kotlin.viper.modules.second.SecondActivity
import com.kotlin.viper.services.AndroidModule
import com.kotlin.viper.services.ApiModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [
        ApiModule::class,
        AndroidModule::class
    ]
)

@Singleton
interface AppComponent {

    fun inject(activity: FirstActivity)
    fun inject(activity: SecondActivity)

}