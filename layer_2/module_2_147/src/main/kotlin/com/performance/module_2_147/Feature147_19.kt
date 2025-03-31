package com.performance.module_2_147

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature147Repository2 {
    private val dataSource = Feature147DataSource2()
    private val mapper = Feature147DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
