package com.performance.module_2_216

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature216Repository0 {
    private val dataSource = Feature216DataSource0()
    private val mapper = Feature216DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
