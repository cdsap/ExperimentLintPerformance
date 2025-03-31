package com.performance.module_3_175

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature175Repository0 {
    private val dataSource = Feature175DataSource0()
    private val mapper = Feature175DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
