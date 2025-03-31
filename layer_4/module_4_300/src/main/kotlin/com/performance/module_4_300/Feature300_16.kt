package com.performance.module_4_300

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature300Repository1 {
    private val dataSource = Feature300DataSource1()
    private val mapper = Feature300DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
