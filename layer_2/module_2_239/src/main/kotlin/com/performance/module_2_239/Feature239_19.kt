package com.performance.module_2_239

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature239Repository2 {
    private val dataSource = Feature239DataSource2()
    private val mapper = Feature239DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
