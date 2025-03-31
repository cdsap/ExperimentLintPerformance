package com.performance.module_1_148

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature148Repository1 {
    private val dataSource = Feature148DataSource1()
    private val mapper = Feature148DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
