package com.performance.module_2_48

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature48Repository1 {
    private val dataSource = Feature48DataSource1()
    private val mapper = Feature48DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
