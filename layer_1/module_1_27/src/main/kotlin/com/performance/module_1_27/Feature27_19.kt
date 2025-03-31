package com.performance.module_1_27

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature27Repository2 {
    private val dataSource = Feature27DataSource2()
    private val mapper = Feature27DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
