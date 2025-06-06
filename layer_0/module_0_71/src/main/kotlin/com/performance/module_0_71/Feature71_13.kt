package com.performance.module_0_71

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature71Repository0 {
    private val dataSource = Feature71DataSource0()
    private val mapper = Feature71DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
