package com.performance.module_0_64

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature64Repository0 {
    private val dataSource = Feature64DataSource0()
    private val mapper = Feature64DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
