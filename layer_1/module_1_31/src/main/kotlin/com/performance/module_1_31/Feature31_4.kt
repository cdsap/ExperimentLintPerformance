package com.performance.module_1_31

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_12.Feature12Api
import com.performance.module_0_10.Feature10Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_11.Feature11Api
import com.performance.module_0_3.Feature3Api

class Feature31Repository {
    
        private val api0 = Feature5Api()
        private val api1 = Feature12Api()
        private val api2 = Feature10Api()
        private val api3 = Feature6Api()
        private val api4 = Feature11Api()
        private val api5 = Feature3Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 31"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature31Api {
    suspend fun fetchData(): String {
        return "Data from Feature 31 API"
    }
}
