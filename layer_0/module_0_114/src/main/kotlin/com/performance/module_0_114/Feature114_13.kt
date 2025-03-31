package com.performance.module_0_114

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature114Repository0 {
    private val dataSource = Feature114DataSource0()
    private val mapper = Feature114DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
