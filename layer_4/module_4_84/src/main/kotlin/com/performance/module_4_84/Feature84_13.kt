package com.performance.module_4_84

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature84Repository0 {
    private val dataSource = Feature84DataSource0()
    private val mapper = Feature84DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
