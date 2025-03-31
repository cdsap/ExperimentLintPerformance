package com.performance.module_3_260

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature260Repository2 {
    private val dataSource = Feature260DataSource2()
    private val mapper = Feature260DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
