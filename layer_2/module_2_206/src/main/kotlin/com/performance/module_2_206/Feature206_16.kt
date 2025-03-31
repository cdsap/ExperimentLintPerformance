package com.performance.module_2_206

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature206Repository1 {
    private val dataSource = Feature206DataSource1()
    private val mapper = Feature206DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
