package com.performance.module_2_135

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_94.Feature94Api

class Feature135Repository {
    
        private val api0 = Feature94Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 135"
            api0.fetchData()
        }
    }
}

class Feature135Api {
    suspend fun fetchData(): String {
        return "Data from Feature 135 API"
    }
}
