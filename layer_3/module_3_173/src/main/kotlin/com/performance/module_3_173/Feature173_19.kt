package com.performance.module_3_173

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature173Repository2 {
    private val dataSource = Feature173DataSource2()
    private val mapper = Feature173DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
