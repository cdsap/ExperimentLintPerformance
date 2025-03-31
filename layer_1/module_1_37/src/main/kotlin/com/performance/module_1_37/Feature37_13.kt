package com.performance.module_1_37

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature37Repository0 {
    private val dataSource = Feature37DataSource0()
    private val mapper = Feature37DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
