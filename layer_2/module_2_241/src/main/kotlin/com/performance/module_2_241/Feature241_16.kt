package com.performance.module_2_241

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature241Repository1 {
    private val dataSource = Feature241DataSource1()
    private val mapper = Feature241DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
