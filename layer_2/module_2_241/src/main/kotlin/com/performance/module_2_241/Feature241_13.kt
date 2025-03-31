package com.performance.module_2_241

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature241Repository0 {
    private val dataSource = Feature241DataSource0()
    private val mapper = Feature241DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
