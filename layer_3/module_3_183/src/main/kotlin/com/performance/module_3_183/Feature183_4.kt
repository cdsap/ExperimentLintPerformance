package com.performance.module_3_183

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_135.Feature135Api
import com.performance.module_2_153.Feature153Api

class Feature183Repository {
    
        private val api0 = Feature135Api()
        private val api1 = Feature153Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 183"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature183Api {
    suspend fun fetchData(): String {
        return "Data from Feature 183 API"
    }
}
