package com.performance.module_4_191

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature191Repository2 {
    private val dataSource = Feature191DataSource2()
    private val mapper = Feature191DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
