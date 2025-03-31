package com.performance.module_1_29

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature29Repository0 {
    private val dataSource = Feature29DataSource0()
    private val mapper = Feature29DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
