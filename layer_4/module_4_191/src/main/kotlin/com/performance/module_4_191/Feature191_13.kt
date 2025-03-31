package com.performance.module_4_191

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature191Repository0 {
    private val dataSource = Feature191DataSource0()
    private val mapper = Feature191DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
