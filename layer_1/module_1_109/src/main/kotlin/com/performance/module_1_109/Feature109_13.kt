package com.performance.module_1_109

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature109Repository0 {
    private val dataSource = Feature109DataSource0()
    private val mapper = Feature109DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
