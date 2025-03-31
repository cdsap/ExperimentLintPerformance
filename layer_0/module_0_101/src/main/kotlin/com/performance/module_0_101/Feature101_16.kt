package com.performance.module_0_101

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature101Repository1 {
    private val dataSource = Feature101DataSource1()
    private val mapper = Feature101DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
