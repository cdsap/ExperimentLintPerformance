package com.performance.module_2_202

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature202Repository2 {
    private val dataSource = Feature202DataSource2()
    private val mapper = Feature202DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
