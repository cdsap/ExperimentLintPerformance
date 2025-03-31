package com.performance.module_1_148

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature148Repository0 {
    private val dataSource = Feature148DataSource0()
    private val mapper = Feature148DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
