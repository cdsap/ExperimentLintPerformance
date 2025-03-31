package com.performance.module_0_90

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature90Repository0 {
    private val dataSource = Feature90DataSource0()
    private val mapper = Feature90DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
