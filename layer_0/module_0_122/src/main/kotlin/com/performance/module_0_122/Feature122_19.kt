package com.performance.module_0_122

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature122Repository2 {
    private val dataSource = Feature122DataSource2()
    private val mapper = Feature122DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
