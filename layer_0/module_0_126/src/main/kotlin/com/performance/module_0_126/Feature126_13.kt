package com.performance.module_0_126

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature126Repository0 {
    private val dataSource = Feature126DataSource0()
    private val mapper = Feature126DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
