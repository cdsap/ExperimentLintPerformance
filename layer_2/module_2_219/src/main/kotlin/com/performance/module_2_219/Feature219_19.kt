package com.performance.module_2_219

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature219Repository2 {
    private val dataSource = Feature219DataSource2()
    private val mapper = Feature219DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
