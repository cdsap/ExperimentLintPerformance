package com.performance.module_0_26

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature26Repository2 {
    private val dataSource = Feature26DataSource2()
    private val mapper = Feature26DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
