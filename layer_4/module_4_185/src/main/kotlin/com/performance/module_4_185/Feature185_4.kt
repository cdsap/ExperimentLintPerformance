package com.performance.module_4_185

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_167.Feature167Api
import com.performance.module_3_171.Feature171Api

class Feature185Repository {
    
        private val api0 = Feature167Api()
        private val api1 = Feature171Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 185"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature185Api {
    suspend fun fetchData(): String {
        return "Data from Feature 185 API"
    }
}
