package com.performance.module_0_45

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature45Repository1 {
    private val dataSource = Feature45DataSource1()
    private val mapper = Feature45DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
