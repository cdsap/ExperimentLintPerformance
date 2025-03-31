package com.performance.module_4_285

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature285Repository2 {
    private val dataSource = Feature285DataSource2()
    private val mapper = Feature285DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
