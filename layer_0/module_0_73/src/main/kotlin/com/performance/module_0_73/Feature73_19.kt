package com.performance.module_0_73

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature73Repository2 {
    private val dataSource = Feature73DataSource2()
    private val mapper = Feature73DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
