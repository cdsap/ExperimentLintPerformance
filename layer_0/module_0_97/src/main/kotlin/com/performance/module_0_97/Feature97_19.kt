package com.performance.module_0_97

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature97Repository2 {
    private val dataSource = Feature97DataSource2()
    private val mapper = Feature97DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
