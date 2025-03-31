package com.performance.module_3_244

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature244Repository2 {
    private val dataSource = Feature244DataSource2()
    private val mapper = Feature244DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
