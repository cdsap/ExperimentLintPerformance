package com.performance.module_0_116

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature116Repository0 {
    private val dataSource = Feature116DataSource0()
    private val mapper = Feature116DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
