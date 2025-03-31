package com.performance.module_0_35

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature35Repository0 {
    private val dataSource = Feature35DataSource0()
    private val mapper = Feature35DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
