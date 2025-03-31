package com.performance.module_3_264

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature264Repository1 {
    private val dataSource = Feature264DataSource1()
    private val mapper = Feature264DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
