package com.performance.module_0_48

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature48Repository2 {
    private val dataSource = Feature48DataSource2()
    private val mapper = Feature48DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
