package com.performance.module_0_68

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature68Repository1 {
    private val dataSource = Feature68DataSource1()
    private val mapper = Feature68DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
