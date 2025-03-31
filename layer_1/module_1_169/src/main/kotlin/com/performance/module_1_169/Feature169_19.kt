package com.performance.module_1_169

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature169Repository2 {
    private val dataSource = Feature169DataSource2()
    private val mapper = Feature169DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
