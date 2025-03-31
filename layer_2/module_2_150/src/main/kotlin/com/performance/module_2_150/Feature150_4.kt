package com.performance.module_2_150

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_115.Feature115Api
import com.performance.module_1_121.Feature121Api
import com.performance.module_1_94.Feature94Api
import com.performance.module_1_96.Feature96Api
import com.performance.module_1_118.Feature118Api

class Feature150Repository {
    
        private val api0 = Feature115Api()
        private val api1 = Feature121Api()
        private val api2 = Feature94Api()
        private val api3 = Feature96Api()
        private val api4 = Feature118Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 150"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature150Api {
    suspend fun fetchData(): String {
        return "Data from Feature 150 API"
    }
}
