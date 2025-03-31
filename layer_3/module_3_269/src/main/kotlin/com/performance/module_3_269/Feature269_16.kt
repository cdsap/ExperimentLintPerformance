package com.performance.module_3_269

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature269Repository1 {
    private val dataSource = Feature269DataSource1()
    private val mapper = Feature269DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
