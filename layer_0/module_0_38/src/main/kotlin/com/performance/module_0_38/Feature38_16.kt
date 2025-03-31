package com.performance.module_0_38

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature38Repository1 {
    private val dataSource = Feature38DataSource1()
    private val mapper = Feature38DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
