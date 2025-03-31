package com.performance.module_0_19

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature19Repository2 {
    private val dataSource = Feature19DataSource2()
    private val mapper = Feature19DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
