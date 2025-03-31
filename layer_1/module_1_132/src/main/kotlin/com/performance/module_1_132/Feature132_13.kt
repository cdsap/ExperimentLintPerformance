package com.performance.module_1_132

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature132Repository0 {
    private val dataSource = Feature132DataSource0()
    private val mapper = Feature132DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
