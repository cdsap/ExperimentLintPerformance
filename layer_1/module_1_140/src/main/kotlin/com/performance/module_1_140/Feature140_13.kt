package com.performance.module_1_140

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature140Repository0 {
    private val dataSource = Feature140DataSource0()
    private val mapper = Feature140DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
