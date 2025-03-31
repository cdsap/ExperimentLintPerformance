package com.performance.module_2_150

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature150Repository2 {
    private val dataSource = Feature150DataSource2()
    private val mapper = Feature150DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
