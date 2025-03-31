package com.performance.module_0_109

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature109Repository1 {
    private val dataSource = Feature109DataSource1()
    private val mapper = Feature109DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
