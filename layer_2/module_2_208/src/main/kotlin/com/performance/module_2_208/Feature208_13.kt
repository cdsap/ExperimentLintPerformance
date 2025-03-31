package com.performance.module_2_208

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature208Repository0 {
    private val dataSource = Feature208DataSource0()
    private val mapper = Feature208DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
