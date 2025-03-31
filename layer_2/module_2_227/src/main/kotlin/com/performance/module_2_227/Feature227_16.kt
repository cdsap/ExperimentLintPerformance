package com.performance.module_2_227

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature227Repository1 {
    private val dataSource = Feature227DataSource1()
    private val mapper = Feature227DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
