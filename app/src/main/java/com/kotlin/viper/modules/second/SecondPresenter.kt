package com.kotlin.viper.modules.second

import com.kotlin.viper.common.BasePresenter
import javax.inject.Inject

class SecondPresenter @Inject
constructor() : BasePresenter<ISecondView.View, SecondInteractor>(), ISecondView.Callback {



}