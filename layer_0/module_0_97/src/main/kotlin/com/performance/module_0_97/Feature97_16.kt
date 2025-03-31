package com.performance.module_0_97

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature97Repository1 {
    private val dataSource = Feature97DataSource1()
    private val mapper = Feature97DataMapper1()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
