package com.performance.module_3_164

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_152.Feature152Api

class Feature164Repository {
    
        private val api0 = Feature152Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 164"
            api0.fetchData()
        }
    }
}

class Feature164Api {
    suspend fun fetchData(): String {
        return "Data from Feature 164 API"
    }
}
