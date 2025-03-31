package com.performance.module_0_28

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature28Repository1 {
    private val dataSource = Feature28DataSource1()
    private val mapper = Feature28DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
