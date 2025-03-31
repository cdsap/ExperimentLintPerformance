package com.performance.module_1_122

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature122Repository1 {
    private val dataSource = Feature122DataSource1()
    private val mapper = Feature122DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
