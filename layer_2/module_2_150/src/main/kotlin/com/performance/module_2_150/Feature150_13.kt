package com.performance.module_2_150

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature150Repository0 {
    private val dataSource = Feature150DataSource0()
    private val mapper = Feature150DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
