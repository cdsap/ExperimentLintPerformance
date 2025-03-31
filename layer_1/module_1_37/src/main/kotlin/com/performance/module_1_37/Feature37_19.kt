package com.performance.module_1_37

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature37Repository2 {
    private val dataSource = Feature37DataSource2()
    private val mapper = Feature37DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
