package com.performance.module_0_70

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature70Repository0 {
    private val dataSource = Feature70DataSource0()
    private val mapper = Feature70DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
