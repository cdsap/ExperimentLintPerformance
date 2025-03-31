package com.performance.module_2_140

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature140Repository2 {
    private val dataSource = Feature140DataSource2()
    private val mapper = Feature140DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
