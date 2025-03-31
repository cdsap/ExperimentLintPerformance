package com.performance.module_2_209

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature209Repository2 {
    private val dataSource = Feature209DataSource2()
    private val mapper = Feature209DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
