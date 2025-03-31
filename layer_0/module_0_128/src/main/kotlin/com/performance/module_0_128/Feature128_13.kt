package com.performance.module_0_128

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature128Repository0 {
    private val dataSource = Feature128DataSource0()
    private val mapper = Feature128DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
