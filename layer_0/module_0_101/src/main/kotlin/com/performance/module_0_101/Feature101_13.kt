package com.performance.module_0_101

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature101Repository0 {
    private val dataSource = Feature101DataSource0()
    private val mapper = Feature101DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
