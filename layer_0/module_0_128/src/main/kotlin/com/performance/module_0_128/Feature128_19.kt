package com.performance.module_0_128

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature128Repository2 {
    private val dataSource = Feature128DataSource2()
    private val mapper = Feature128DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
