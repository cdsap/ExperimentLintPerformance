package com.performance.module_4_84

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_59.Feature59Api

class Feature84Repository {
    
        private val api0 = Feature59Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 84"
            api0.fetchData()
        }
    }
}

class Feature84Api {
    suspend fun fetchData(): String {
        return "Data from Feature 84 API"
    }
}
