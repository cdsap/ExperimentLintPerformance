package com.performance.module_2_204

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature204Repository0 {
    private val dataSource = Feature204DataSource0()
    private val mapper = Feature204DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
