package com.performance.module_4_189

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_173.Feature173Api
import com.performance.module_3_175.Feature175Api

class Feature189Repository {
    
        private val api0 = Feature173Api()
        private val api1 = Feature175Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 189"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature189Api {
    suspend fun fetchData(): String {
        return "Data from Feature 189 API"
    }
}
