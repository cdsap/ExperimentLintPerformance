package com.performance.module_1_45

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_4.Feature4Api

class Feature45Repository {
    
        private val api0 = Feature5Api()
        private val api1 = Feature4Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 45"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature45Api {
    suspend fun fetchData(): String {
        return "Data from Feature 45 API"
    }
}
