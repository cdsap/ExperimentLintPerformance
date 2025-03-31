package com.performance.module_2_202

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature202Repository1 {
    private val dataSource = Feature202DataSource1()
    private val mapper = Feature202DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
