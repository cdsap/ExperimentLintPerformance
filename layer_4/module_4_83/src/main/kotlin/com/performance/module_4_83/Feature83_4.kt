package com.performance.module_4_83

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_49.Feature49Api
import com.performance.module_3_54.Feature54Api
import com.performance.module_3_57.Feature57Api

class Feature83Repository {
    
        private val api0 = Feature49Api()
        private val api1 = Feature54Api()
        private val api2 = Feature57Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 83"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature83Api {
    suspend fun fetchData(): String {
        return "Data from Feature 83 API"
    }
}
