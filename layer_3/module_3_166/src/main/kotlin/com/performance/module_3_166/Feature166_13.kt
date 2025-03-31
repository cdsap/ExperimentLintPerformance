package com.performance.module_3_166

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature166Repository0 {
    private val dataSource = Feature166DataSource0()
    private val mapper = Feature166DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
