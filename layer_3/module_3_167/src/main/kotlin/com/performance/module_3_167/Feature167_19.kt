package com.performance.module_3_167

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature167Repository2 {
    private val dataSource = Feature167DataSource2()
    private val mapper = Feature167DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
