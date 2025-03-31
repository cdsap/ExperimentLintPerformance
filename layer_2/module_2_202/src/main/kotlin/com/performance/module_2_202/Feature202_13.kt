package com.performance.module_2_202

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature202Repository0 {
    private val dataSource = Feature202DataSource0()
    private val mapper = Feature202DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
