package com.performance.module_3_261

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_210.Feature210Api
import com.performance.module_2_219.Feature219Api
import com.performance.module_2_222.Feature222Api

class Feature261Repository {
    
        private val api0 = Feature210Api()
        private val api1 = Feature219Api()
        private val api2 = Feature222Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 261"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature261Api {
    suspend fun fetchData(): String {
        return "Data from Feature 261 API"
    }
}
