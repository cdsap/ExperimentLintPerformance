package com.performance.module_1_90

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature90Repository2 {
    private val dataSource = Feature90DataSource2()
    private val mapper = Feature90DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
