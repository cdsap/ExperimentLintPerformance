package com.performance.module_2_147

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature147Repository1 {
    private val dataSource = Feature147DataSource1()
    private val mapper = Feature147DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
