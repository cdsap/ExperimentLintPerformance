package com.performance.module_1_41

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_6.Feature6Api

class Feature41Repository {
    
        private val api0 = Feature5Api()
        private val api1 = Feature6Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 41"
            api0.fetchData()
            api1.fetchData()
        }
    }
}

class Feature41Api {
    suspend fun fetchData(): String {
        return "Data from Feature 41 API"
    }
}
