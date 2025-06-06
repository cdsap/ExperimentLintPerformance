package com.performance.module_1_154

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature154Repository0 {
    private val dataSource = Feature154DataSource0()
    private val mapper = Feature154DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
