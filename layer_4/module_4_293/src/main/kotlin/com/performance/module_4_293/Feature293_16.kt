package com.performance.module_4_293

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature293Repository1 {
    private val dataSource = Feature293DataSource1()
    private val mapper = Feature293DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
