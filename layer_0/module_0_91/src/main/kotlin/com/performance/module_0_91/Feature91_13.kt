package com.performance.module_0_91

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature91Repository0 {
    private val dataSource = Feature91DataSource0()
    private val mapper = Feature91DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
