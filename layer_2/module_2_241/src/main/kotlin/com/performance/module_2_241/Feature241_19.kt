package com.performance.module_2_241

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature241Repository2 {
    private val dataSource = Feature241DataSource2()
    private val mapper = Feature241DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
