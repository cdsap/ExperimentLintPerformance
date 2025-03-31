package com.performance.module_2_208

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature208Repository2 {
    private val dataSource = Feature208DataSource2()
    private val mapper = Feature208DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
