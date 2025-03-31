package com.performance.module_2_149

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_89.Feature89Api

class Feature149Repository {
    
        private val api0 = Feature89Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 149"
            api0.fetchData()
        }
    }
}

class Feature149Api {
    suspend fun fetchData(): String {
        return "Data from Feature 149 API"
    }
}
