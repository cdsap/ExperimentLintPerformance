package com.performance.module_3_68

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature68Repository0 {
    private val dataSource = Feature68DataSource0()
    private val mapper = Feature68DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
