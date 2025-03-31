package com.performance.module_2_228

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature228Repository2 {
    private val dataSource = Feature228DataSource2()
    private val mapper = Feature228DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
