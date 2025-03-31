package com.performance.module_2_232

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature232Repository1 {
    private val dataSource = Feature232DataSource1()
    private val mapper = Feature232DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
