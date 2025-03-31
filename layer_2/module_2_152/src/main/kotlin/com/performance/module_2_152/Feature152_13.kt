package com.performance.module_2_152

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature152Repository0 {
    private val dataSource = Feature152DataSource0()
    private val mapper = Feature152DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
