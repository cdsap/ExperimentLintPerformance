package com.performance.module_0_5

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature5Repository0 {
    private val dataSource = Feature5DataSource0()
    private val mapper = Feature5DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
