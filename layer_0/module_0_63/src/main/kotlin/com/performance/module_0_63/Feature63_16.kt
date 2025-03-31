package com.performance.module_0_63

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature63Repository1 {
    private val dataSource = Feature63DataSource1()
    private val mapper = Feature63DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
