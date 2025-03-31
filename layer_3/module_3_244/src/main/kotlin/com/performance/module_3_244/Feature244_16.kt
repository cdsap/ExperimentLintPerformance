package com.performance.module_3_244

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature244Repository1 {
    private val dataSource = Feature244DataSource1()
    private val mapper = Feature244DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
