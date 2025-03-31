package com.performance.module_2_154

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature154Repository1 {
    private val dataSource = Feature154DataSource1()
    private val mapper = Feature154DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
