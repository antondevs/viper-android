package com.kotlin.viper.services

import com.kotlin.viper.models.Item
import dagger.Module

interface ApiProtocol {
    fun loadList() : Array<Item>
}

@Module
class ApiService : ApiProtocol {
    override fun loadList(): Array<Item> {
        var items = emptyArray<Item>()

        items.plus(Item("Elem1"))
        items.plus(Item("Elem2"))
        items.plus(Item("Elem3"))

        return items
    }

}