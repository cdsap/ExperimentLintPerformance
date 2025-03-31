package com.performance.module_0_53

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature53Repository0 {
    private val dataSource = Feature53DataSource0()
    private val mapper = Feature53DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
