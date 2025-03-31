package com.performance.module_2_209

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature209Repository1 {
    private val dataSource = Feature209DataSource1()
    private val mapper = Feature209DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
