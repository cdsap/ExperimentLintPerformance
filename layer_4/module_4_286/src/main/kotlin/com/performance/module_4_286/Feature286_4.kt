package com.performance.module_4_286

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_260.Feature260Api
import com.performance.module_3_244.Feature244Api
import com.performance.module_3_256.Feature256Api
import com.performance.module_3_250.Feature250Api

class Feature286Repository {
    
        private val api0 = Feature260Api()
        private val api1 = Feature244Api()
        private val api2 = Feature256Api()
        private val api3 = Feature250Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 286"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
        }
    }
}

class Feature286Api {
    suspend fun fetchData(): String {
        return "Data from Feature 286 API"
    }
}
