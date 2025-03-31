package com.performance.module_4_186

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import com.performance.module_3_177.Feature177Repository
import com.performance.module_3_168.Feature168Repository

class Feature186Provider : ContentProvider() {
    private val database = Feature186Database()
    private val coroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    
        private val repository0 = Feature177Repository()
        private val repository1 = Feature168Repository()


    override fun onCreate(): Boolean {
        coroutineScope.launch {
            repository0.getData()
            repository1.getData()
        }
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? = runBlocking(Dispatchers.IO) {
        database.query()
    }

    override fun getType(uri: Uri): String? = null

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int = 0

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int = 0
}

class Feature186Database {
    suspend fun query(): Cursor? {
        return withContext(Dispatchers.IO) {
            // Simulate database query
            null
        }
    }
}
