package com.performance.module_1_37

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature37Repository1 {
    private val dataSource = Feature37DataSource1()
    private val mapper = Feature37DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
