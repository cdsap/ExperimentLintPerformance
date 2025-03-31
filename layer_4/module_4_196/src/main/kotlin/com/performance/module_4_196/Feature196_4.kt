package com.performance.module_4_196

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_180.Feature180Api
import com.performance.module_3_171.Feature171Api

class Feature196Repository {
    
        private val api0 = Feature180Api()
        private val api1 = Feature171Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 196"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature196Api {
    suspend fun fetchData(): String {
        return "Data from Feature 196 API"
    }
}
