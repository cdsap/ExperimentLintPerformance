package com.performance.module_3_253

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature253Repository2 {
    private val dataSource = Feature253DataSource2()
    private val mapper = Feature253DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
