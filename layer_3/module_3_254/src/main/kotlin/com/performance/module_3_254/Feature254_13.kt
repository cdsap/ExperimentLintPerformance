package com.performance.module_3_254

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature254Repository0 {
    private val dataSource = Feature254DataSource0()
    private val mapper = Feature254DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
