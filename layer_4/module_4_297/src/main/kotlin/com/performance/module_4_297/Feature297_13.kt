package com.performance.module_4_297

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature297Repository0 {
    private val dataSource = Feature297DataSource0()
    private val mapper = Feature297DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
