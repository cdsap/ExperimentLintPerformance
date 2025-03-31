package com.performance.module_1_189

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature189Repository0 {
    private val dataSource = Feature189DataSource0()
    private val mapper = Feature189DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
