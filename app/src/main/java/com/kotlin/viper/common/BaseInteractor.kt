package com.kotlin.viper.common

import com.kotlin.viper.services.ApiService
import javax.inject.Inject

open class BaseInteractor {

    @Inject
    protected lateinit var apiLayer: ApiService

}