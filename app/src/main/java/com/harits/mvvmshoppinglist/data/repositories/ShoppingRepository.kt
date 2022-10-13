package com.harits.mvvmshoppinglist.data.repositories

import com.harits.mvvmshoppinglist.ShoppingDatabase
import com.harits.mvvmshoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)
    fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}