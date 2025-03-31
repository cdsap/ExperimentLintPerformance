package com.performance.module_4_285

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_266.Feature266Api

class Feature285Repository {
    
        private val api0 = Feature266Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 285"
            api0.fetchData()
        }
    }
}

class Feature285Api {
    suspend fun fetchData(): String {
        return "Data from Feature 285 API"
    }
}
