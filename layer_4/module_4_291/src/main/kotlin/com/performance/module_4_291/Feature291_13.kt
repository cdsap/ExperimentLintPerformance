package com.performance.module_4_291

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature291Repository0 {
    private val dataSource = Feature291DataSource0()
    private val mapper = Feature291DataMapper0()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
