package com.performance.module_3_173

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature173Repository1 {
    private val dataSource = Feature173DataSource1()
    private val mapper = Feature173DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
