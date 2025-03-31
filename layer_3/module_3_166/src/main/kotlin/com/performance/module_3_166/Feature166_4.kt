package com.performance.module_3_166

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_151.Feature151Api
import com.performance.module_2_142.Feature142Api

class Feature166Repository {
    
        private val api0 = Feature151Api()
        private val api1 = Feature142Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 166"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature166Api {
    suspend fun fetchData(): String {
        return "Data from Feature 166 API"
    }
}
