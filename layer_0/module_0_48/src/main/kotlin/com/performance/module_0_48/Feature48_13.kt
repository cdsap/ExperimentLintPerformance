package com.performance.module_0_48

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature48Repository0 {
    private val dataSource = Feature48DataSource0()
    private val mapper = Feature48DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
