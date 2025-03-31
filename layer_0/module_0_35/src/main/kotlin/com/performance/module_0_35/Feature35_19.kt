package com.performance.module_0_35

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature35Repository2 {
    private val dataSource = Feature35DataSource2()
    private val mapper = Feature35DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
