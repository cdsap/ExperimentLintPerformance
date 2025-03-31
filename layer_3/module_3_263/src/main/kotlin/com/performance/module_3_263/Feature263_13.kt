package com.performance.module_3_263

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature263Repository0 {
    private val dataSource = Feature263DataSource0()
    private val mapper = Feature263DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
