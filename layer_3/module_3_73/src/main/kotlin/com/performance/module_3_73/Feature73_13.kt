package com.performance.module_3_73

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature73Repository0 {
    private val dataSource = Feature73DataSource0()
    private val mapper = Feature73DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
