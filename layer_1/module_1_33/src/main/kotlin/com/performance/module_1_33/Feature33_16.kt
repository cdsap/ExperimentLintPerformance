package com.performance.module_1_33

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature33Repository1 {
    private val dataSource = Feature33DataSource1()
    private val mapper = Feature33DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
