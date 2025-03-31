package com.performance.module_2_210

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature210Repository2 {
    private val dataSource = Feature210DataSource2()
    private val mapper = Feature210DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
