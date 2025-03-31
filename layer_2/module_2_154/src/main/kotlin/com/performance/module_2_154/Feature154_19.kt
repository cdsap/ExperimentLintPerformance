package com.performance.module_2_154

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature154Repository2 {
    private val dataSource = Feature154DataSource2()
    private val mapper = Feature154DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
