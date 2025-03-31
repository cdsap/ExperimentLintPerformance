package com.performance.module_1_189

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature189Repository1 {
    private val dataSource = Feature189DataSource1()
    private val mapper = Feature189DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
