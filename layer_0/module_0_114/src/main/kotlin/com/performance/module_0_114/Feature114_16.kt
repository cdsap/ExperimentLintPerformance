package com.performance.module_0_114

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature114Repository1 {
    private val dataSource = Feature114DataSource1()
    private val mapper = Feature114DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
