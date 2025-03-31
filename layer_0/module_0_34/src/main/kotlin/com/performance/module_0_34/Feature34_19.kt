package com.performance.module_0_34

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature34Repository2 {
    private val dataSource = Feature34DataSource2()
    private val mapper = Feature34DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
