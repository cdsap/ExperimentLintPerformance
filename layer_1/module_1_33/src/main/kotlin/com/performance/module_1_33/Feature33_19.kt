package com.performance.module_1_33

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature33Repository2 {
    private val dataSource = Feature33DataSource2()
    private val mapper = Feature33DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
