package com.kotlin.viper.services

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides
    @Singleton
    fun providesApiService(): ApiService {
        return ApiService()
    }

}