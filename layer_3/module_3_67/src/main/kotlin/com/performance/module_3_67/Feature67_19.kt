package com.performance.module_3_67

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature67Repository2 {
    private val dataSource = Feature67DataSource2()
    private val mapper = Feature67DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
