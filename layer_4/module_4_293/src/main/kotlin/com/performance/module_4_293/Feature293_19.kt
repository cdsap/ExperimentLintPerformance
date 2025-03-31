package com.performance.module_4_293

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature293Repository2 {
    private val dataSource = Feature293DataSource2()
    private val mapper = Feature293DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
