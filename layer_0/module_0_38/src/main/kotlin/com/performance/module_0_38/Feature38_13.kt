package com.performance.module_0_38

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature38Repository0 {
    private val dataSource = Feature38DataSource0()
    private val mapper = Feature38DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
