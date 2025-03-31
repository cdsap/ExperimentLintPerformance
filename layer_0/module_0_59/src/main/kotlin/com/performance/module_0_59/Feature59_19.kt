package com.performance.module_0_59

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature59Repository2 {
    private val dataSource = Feature59DataSource2()
    private val mapper = Feature59DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
