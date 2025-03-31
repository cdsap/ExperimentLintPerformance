package com.performance.module_0_105

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature105Repository0 {
    private val dataSource = Feature105DataSource0()
    private val mapper = Feature105DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
