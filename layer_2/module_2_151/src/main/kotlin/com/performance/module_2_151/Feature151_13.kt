package com.performance.module_2_151

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature151Repository0 {
    private val dataSource = Feature151DataSource0()
    private val mapper = Feature151DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
