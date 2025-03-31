package com.performance.module_4_295

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature295Repository0 {
    private val dataSource = Feature295DataSource0()
    private val mapper = Feature295DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
