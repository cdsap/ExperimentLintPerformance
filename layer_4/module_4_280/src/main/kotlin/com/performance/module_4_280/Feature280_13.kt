package com.performance.module_4_280

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature280Repository0 {
    private val dataSource = Feature280DataSource0()
    private val mapper = Feature280DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
