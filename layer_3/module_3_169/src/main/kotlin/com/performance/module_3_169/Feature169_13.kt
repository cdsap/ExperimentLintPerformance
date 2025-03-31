package com.performance.module_3_169

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature169Repository0 {
    private val dataSource = Feature169DataSource0()
    private val mapper = Feature169DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
