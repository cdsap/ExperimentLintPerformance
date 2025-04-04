package com.performance.module_0_47

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature47Repository0 {
    private val dataSource = Feature47DataSource0()
    private val mapper = Feature47DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
