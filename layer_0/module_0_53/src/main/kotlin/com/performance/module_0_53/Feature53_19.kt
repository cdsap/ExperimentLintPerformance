package com.performance.module_0_53

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature53Repository2 {
    private val dataSource = Feature53DataSource2()
    private val mapper = Feature53DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
