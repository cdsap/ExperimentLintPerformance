package com.performance.module_1_20

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature20Repository0 {
    private val dataSource = Feature20DataSource0()
    private val mapper = Feature20DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
