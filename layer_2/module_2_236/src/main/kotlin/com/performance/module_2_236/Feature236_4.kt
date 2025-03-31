package com.performance.module_2_236

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_191.Feature191Api
import com.performance.module_1_172.Feature172Api
import com.performance.module_1_181.Feature181Api

class Feature236Repository {
    
        private val api0 = Feature191Api()
        private val api1 = Feature172Api()
        private val api2 = Feature181Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 236"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature236Api {
    suspend fun fetchData(): String {
        return "Data from Feature 236 API"
    }
}
