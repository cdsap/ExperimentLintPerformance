package com.performance.module_3_255

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature255Repository0 {
    private val dataSource = Feature255DataSource0()
    private val mapper = Feature255DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
