package com.performance.module_3_166

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature166Repository2 {
    private val dataSource = Feature166DataSource2()
    private val mapper = Feature166DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
