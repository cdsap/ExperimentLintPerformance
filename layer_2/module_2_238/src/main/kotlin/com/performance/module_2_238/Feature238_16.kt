package com.performance.module_2_238

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature238Repository1 {
    private val dataSource = Feature238DataSource1()
    private val mapper = Feature238DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
