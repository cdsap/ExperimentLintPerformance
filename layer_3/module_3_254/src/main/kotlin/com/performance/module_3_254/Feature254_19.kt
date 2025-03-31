package com.performance.module_3_254

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature254Repository2 {
    private val dataSource = Feature254DataSource2()
    private val mapper = Feature254DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
