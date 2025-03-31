package com.performance.module_2_238

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature238Repository0 {
    private val dataSource = Feature238DataSource0()
    private val mapper = Feature238DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
