package com.performance.module_1_97

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature97Repository0 {
    private val dataSource = Feature97DataSource0()
    private val mapper = Feature97DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
