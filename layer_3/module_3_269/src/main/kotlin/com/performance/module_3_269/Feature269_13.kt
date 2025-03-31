package com.performance.module_3_269

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature269Repository0 {
    private val dataSource = Feature269DataSource0()
    private val mapper = Feature269DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
