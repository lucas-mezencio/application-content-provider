package com.lucasmezencio.applicationcontentprovider

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickedItem(cursor: Cursor)
    fun noteRemoveItem(Cursor: Cursor?)
}