package com.performance.module_0_63

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature63Repository0 {
    private val dataSource = Feature63DataSource0()
    private val mapper = Feature63DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
