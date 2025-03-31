package com.performance.module_1_101

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature101Repository2 {
    private val dataSource = Feature101DataSource2()
    private val mapper = Feature101DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
