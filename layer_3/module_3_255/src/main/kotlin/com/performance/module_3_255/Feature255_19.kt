package com.performance.module_3_255

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature255Repository2 {
    private val dataSource = Feature255DataSource2()
    private val mapper = Feature255DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
