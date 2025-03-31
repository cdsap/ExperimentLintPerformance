package com.performance.module_1_26

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature26Repository0 {
    private val dataSource = Feature26DataSource0()
    private val mapper = Feature26DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
