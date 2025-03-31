package com.performance.module_3_55

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature55Repository0 {
    private val dataSource = Feature55DataSource0()
    private val mapper = Feature55DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
