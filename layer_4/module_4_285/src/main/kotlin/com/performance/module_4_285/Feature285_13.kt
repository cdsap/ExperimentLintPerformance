package com.performance.module_4_285

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature285Repository0 {
    private val dataSource = Feature285DataSource0()
    private val mapper = Feature285DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
