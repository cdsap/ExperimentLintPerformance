package com.performance.module_1_38

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature38Repository2 {
    private val dataSource = Feature38DataSource2()
    private val mapper = Feature38DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
