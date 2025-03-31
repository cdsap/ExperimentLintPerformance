package com.performance.module_5_88

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature88Repository0 {
    private val dataSource = Feature88DataSource0()
    private val mapper = Feature88DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
