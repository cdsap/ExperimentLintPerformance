package com.performance.module_3_68

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature68Repository2 {
    private val dataSource = Feature68DataSource2()
    private val mapper = Feature68DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
