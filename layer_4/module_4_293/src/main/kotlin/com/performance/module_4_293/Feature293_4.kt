package com.performance.module_4_293

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_268.Feature268Api

class Feature293Repository {
    
        private val api0 = Feature268Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 293"
            api0.fetchData()
        }
    }
}

class Feature293Api {
    suspend fun fetchData(): String {
        return "Data from Feature 293 API"
    }
}
