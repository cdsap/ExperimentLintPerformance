package com.performance.module_4_300

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature300Repository2 {
    private val dataSource = Feature300DataSource2()
    private val mapper = Feature300DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
