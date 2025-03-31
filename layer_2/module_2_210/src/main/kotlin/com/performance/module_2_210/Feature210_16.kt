package com.performance.module_2_210

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature210Repository1 {
    private val dataSource = Feature210DataSource1()
    private val mapper = Feature210DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
