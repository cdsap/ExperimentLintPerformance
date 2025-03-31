package com.performance.module_0_49

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature49Repository0 {
    private val dataSource = Feature49DataSource0()
    private val mapper = Feature49DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
