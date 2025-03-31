package com.performance.module_0_78

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature78Repository2 {
    private val dataSource = Feature78DataSource2()
    private val mapper = Feature78DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
