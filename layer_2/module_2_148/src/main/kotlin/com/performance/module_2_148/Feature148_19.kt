package com.performance.module_2_148

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature148Repository2 {
    private val dataSource = Feature148DataSource2()
    private val mapper = Feature148DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
