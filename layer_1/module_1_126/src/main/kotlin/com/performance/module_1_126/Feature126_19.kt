package com.performance.module_1_126

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature126Repository2 {
    private val dataSource = Feature126DataSource2()
    private val mapper = Feature126DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
