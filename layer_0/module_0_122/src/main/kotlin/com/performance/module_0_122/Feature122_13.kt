package com.performance.module_0_122

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature122Repository0 {
    private val dataSource = Feature122DataSource0()
    private val mapper = Feature122DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
