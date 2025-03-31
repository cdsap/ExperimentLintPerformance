package com.performance.module_1_152

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature152Repository1 {
    private val dataSource = Feature152DataSource1()
    private val mapper = Feature152DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
