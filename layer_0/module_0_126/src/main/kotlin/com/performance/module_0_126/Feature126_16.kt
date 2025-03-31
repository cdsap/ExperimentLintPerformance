package com.performance.module_0_126

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature126Repository1 {
    private val dataSource = Feature126DataSource1()
    private val mapper = Feature126DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
