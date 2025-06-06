package com.performance.module_0_28

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature28Repository2 {
    private val dataSource = Feature28DataSource2()
    private val mapper = Feature28DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
