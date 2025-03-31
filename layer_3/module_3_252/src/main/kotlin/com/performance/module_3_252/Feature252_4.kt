package com.performance.module_3_252

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_234.Feature234Api
import com.performance.module_2_238.Feature238Api

class Feature252Repository {
    
        private val api0 = Feature234Api()
        private val api1 = Feature238Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 252"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature252Api {
    suspend fun fetchData(): String {
        return "Data from Feature 252 API"
    }
}
