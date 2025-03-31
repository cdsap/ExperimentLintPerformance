package com.performance.module_0_69

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature69Repository0 {
    private val dataSource = Feature69DataSource0()
    private val mapper = Feature69DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
