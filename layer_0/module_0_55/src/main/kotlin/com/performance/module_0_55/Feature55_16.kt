package com.performance.module_0_55

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature55Repository1 {
    private val dataSource = Feature55DataSource1()
    private val mapper = Feature55DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
