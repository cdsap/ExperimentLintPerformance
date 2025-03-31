package com.performance.module_1_25

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
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_8.Feature8Repository

class Feature25Provider : ContentProvider() {
    private val database = Feature25Database()
    private val coroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    
        private val repository0 = Feature13Repository()
        private val repository1 = Feature9Repository()
        private val repository2 = Feature15Repository()
        private val repository3 = Feature8Repository()


    override fun onCreate(): Boolean {
        coroutineScope.launch {
            repository0.getData()
            repository1.getData()
            repository2.getData()
            repository3.getData()
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

class Feature25Database {
    suspend fun query(): Cursor? {
        return withContext(Dispatchers.IO) {
            // Simulate database query
            null
        }
    }
}
