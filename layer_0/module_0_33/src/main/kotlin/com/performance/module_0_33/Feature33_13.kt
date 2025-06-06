package com.performance.module_0_33

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature33Repository0 {
    private val dataSource = Feature33DataSource0()
    private val mapper = Feature33DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
