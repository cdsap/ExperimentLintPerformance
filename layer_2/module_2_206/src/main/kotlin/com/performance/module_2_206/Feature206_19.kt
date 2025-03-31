package com.performance.module_2_206

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature206Repository2 {
    private val dataSource = Feature206DataSource2()
    private val mapper = Feature206DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
