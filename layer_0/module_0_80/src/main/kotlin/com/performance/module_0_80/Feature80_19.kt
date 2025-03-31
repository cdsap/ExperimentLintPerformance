package com.performance.module_0_80

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature80Repository2 {
    private val dataSource = Feature80DataSource2()
    private val mapper = Feature80DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
