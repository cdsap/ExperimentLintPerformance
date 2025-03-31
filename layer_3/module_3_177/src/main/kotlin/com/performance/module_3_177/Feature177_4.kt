package com.performance.module_3_177

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_158.Feature158Api
import com.performance.module_2_159.Feature159Api

class Feature177Repository {
    
        private val api0 = Feature158Api()
        private val api1 = Feature159Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 177"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature177Api {
    suspend fun fetchData(): String {
        return "Data from Feature 177 API"
    }
}
