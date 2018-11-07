package com.kotlin.viper.modules.first

import com.kotlin.viper.common.BasePresenter
import javax.inject.Inject

class FirstPresenter @Inject
constructor() : BasePresenter<IFirstView.View, FirstInteractor>(), IFirstView.Callback {



}