package com.performance.module_0_44

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature44Repository2 {
    private val dataSource = Feature44DataSource2()
    private val mapper = Feature44DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
