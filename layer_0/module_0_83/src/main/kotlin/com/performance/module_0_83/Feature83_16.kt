package com.performance.module_0_83

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature83Repository1 {
    private val dataSource = Feature83DataSource1()
    private val mapper = Feature83DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
