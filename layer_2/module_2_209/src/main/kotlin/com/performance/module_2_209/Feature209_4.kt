package com.performance.module_2_209

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_178.Feature178Api
import com.performance.module_1_159.Feature159Api

class Feature209Repository {
    
        private val api0 = Feature178Api()
        private val api1 = Feature159Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 209"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature209Api {
    suspend fun fetchData(): String {
        return "Data from Feature 209 API"
    }
}
