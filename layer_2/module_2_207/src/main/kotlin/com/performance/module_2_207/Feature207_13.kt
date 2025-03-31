package com.performance.module_2_207

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature207Repository0 {
    private val dataSource = Feature207DataSource0()
    private val mapper = Feature207DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
