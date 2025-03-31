package com.performance.module_2_242

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_198.Feature198Api
import com.performance.module_1_142.Feature142Api
import com.performance.module_1_167.Feature167Api

class Feature242Repository {
    
        private val api0 = Feature198Api()
        private val api1 = Feature142Api()
        private val api2 = Feature167Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 242"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature242Api {
    suspend fun fetchData(): String {
        return "Data from Feature 242 API"
    }
}
