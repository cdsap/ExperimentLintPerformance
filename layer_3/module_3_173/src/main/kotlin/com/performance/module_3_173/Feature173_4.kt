package com.performance.module_3_173

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_140.Feature140Api

class Feature173Repository {
    
        private val api0 = Feature140Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 173"
            api0.fetchData()
        }
    }
}

class Feature173Api {
    suspend fun fetchData(): String {
        return "Data from Feature 173 API"
    }
}
