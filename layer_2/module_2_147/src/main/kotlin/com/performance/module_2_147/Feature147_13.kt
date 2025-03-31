package com.performance.module_2_147

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature147Repository0 {
    private val dataSource = Feature147DataSource0()
    private val mapper = Feature147DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
