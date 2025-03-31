package com.performance.module_1_34

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_11.Feature11Api

class Feature34Repository {
    
        private val api0 = Feature11Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 34"
            api0.fetchData()
        }
    }
}

class Feature34Api {
    suspend fun fetchData(): String {
        return "Data from Feature 34 API"
    }
}
