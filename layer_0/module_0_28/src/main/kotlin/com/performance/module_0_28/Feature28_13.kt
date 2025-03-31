package com.performance.module_0_28

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature28Repository0 {
    private val dataSource = Feature28DataSource0()
    private val mapper = Feature28DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
