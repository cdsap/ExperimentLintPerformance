package com.performance.module_0_67

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature67Repository0 {
    private val dataSource = Feature67DataSource0()
    private val mapper = Feature67DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
