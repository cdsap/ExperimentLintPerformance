package com.performance.module_1_114

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature114Repository2 {
    private val dataSource = Feature114DataSource2()
    private val mapper = Feature114DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
