package com.performance.module_1_152

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature152Repository2 {
    private val dataSource = Feature152DataSource2()
    private val mapper = Feature152DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
