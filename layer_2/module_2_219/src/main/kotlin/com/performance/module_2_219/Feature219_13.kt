package com.performance.module_2_219

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature219Repository0 {
    private val dataSource = Feature219DataSource0()
    private val mapper = Feature219DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
