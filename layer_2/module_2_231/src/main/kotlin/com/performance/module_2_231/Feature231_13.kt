package com.performance.module_2_231

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature231Repository0 {
    private val dataSource = Feature231DataSource0()
    private val mapper = Feature231DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
