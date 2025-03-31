package com.performance.module_1_17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_1.Feature1Api
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_10.Feature10Api

class Feature17Repository {
    
        private val api0 = Feature1Api()
        private val api1 = Feature5Api()
        private val api2 = Feature15Api()
        private val api3 = Feature3Api()
        private val api4 = Feature6Api()
        private val api5 = Feature10Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 17"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature17Api {
    suspend fun fetchData(): String {
        return "Data from Feature 17 API"
    }
}
