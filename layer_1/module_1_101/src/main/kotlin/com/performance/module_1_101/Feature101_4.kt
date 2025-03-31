package com.performance.module_1_101

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_31.Feature31Api
import com.performance.module_0_29.Feature29Api

class Feature101Repository {
    
        private val api0 = Feature31Api()
        private val api1 = Feature29Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 101"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature101Api {
    suspend fun fetchData(): String {
        return "Data from Feature 101 API"
    }
}
