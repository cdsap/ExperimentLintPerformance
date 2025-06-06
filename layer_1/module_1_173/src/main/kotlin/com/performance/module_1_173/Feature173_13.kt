package com.performance.module_1_173

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature173Repository0 {
    private val dataSource = Feature173DataSource0()
    private val mapper = Feature173DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
