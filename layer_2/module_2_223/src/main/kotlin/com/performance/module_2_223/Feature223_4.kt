package com.performance.module_2_223

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_155.Feature155Api
import com.performance.module_1_164.Feature164Api
import com.performance.module_1_180.Feature180Api
import com.performance.module_1_188.Feature188Api
import com.performance.module_1_197.Feature197Api

class Feature223Repository {
    
        private val api0 = Feature155Api()
        private val api1 = Feature164Api()
        private val api2 = Feature180Api()
        private val api3 = Feature188Api()
        private val api4 = Feature197Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 223"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature223Api {
    suspend fun fetchData(): String {
        return "Data from Feature 223 API"
    }
}
