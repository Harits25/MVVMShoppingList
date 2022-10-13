package com.harits.mvvmshoppinglist.ui.shoppinglist

import com.harits.mvvmshoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}