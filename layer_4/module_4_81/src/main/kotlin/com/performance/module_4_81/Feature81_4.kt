package com.performance.module_4_81

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_69.Feature69Api

class Feature81Repository {
    
        private val api0 = Feature69Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 81"
            api0.fetchData()
        }
    }
}

class Feature81Api {
    suspend fun fetchData(): String {
        return "Data from Feature 81 API"
    }
}
