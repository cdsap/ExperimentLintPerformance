package com.performance.module_2_210

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_184.Feature184Api

class Feature210Repository {
    
        private val api0 = Feature184Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 210"
            api0.fetchData()
        }
    }
}

class Feature210Api {
    suspend fun fetchData(): String {
        return "Data from Feature 210 API"
    }
}
