package com.performance.module_2_227

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature227Repository2 {
    private val dataSource = Feature227DataSource2()
    private val mapper = Feature227DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
