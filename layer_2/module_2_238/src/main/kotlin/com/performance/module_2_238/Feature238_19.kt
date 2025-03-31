package com.performance.module_2_238

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature238Repository2 {
    private val dataSource = Feature238DataSource2()
    private val mapper = Feature238DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
