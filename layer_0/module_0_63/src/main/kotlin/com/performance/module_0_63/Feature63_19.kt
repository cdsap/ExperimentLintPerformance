package com.performance.module_0_63

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature63Repository2 {
    private val dataSource = Feature63DataSource2()
    private val mapper = Feature63DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
