package com.performance.module_3_59

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature59Repository1 {
    private val dataSource = Feature59DataSource1()
    private val mapper = Feature59DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
