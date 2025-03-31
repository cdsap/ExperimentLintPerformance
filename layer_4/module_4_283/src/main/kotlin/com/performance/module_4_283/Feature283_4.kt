package com.performance.module_4_283

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_245.Feature245Api
import com.performance.module_3_265.Feature265Api

class Feature283Repository {
    
        private val api0 = Feature245Api()
        private val api1 = Feature265Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 283"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature283Api {
    suspend fun fetchData(): String {
        return "Data from Feature 283 API"
    }
}
