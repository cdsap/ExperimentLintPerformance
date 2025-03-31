package com.performance.module_4_291

import android.database.Cursor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Feature291Repository2 {
    private val dataSource = Feature291DataSource2()
    private val mapper = Feature291DataMapper2()

    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            mapper.map(dataSource.fetchData())
        }
    }
}
