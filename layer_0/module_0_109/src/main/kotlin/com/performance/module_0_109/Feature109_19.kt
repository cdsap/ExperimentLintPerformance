package com.performance.module_0_109

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature109Repository2 {
    private val dataSource = Feature109DataSource2()
    private val mapper = Feature109DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
