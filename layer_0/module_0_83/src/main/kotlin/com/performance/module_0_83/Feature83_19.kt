package com.performance.module_0_83

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature83Repository2 {
    private val dataSource = Feature83DataSource2()
    private val mapper = Feature83DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
