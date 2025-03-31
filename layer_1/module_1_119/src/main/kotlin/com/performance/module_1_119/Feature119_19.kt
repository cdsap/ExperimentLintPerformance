package com.performance.module_1_119

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature119Repository2 {
    private val dataSource = Feature119DataSource2()
    private val mapper = Feature119DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
