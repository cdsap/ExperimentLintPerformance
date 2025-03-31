package com.performance.module_4_189

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature189Repository2 {
    private val dataSource = Feature189DataSource2()
    private val mapper = Feature189DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
