package com.performance.module_1_37

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_2.Feature2Api
import com.performance.module_0_10.Feature10Api
import com.performance.module_0_11.Feature11Api

class Feature37Repository {
    
        private val api0 = Feature5Api()
        private val api1 = Feature15Api()
        private val api2 = Feature6Api()
        private val api3 = Feature7Api()
        private val api4 = Feature2Api()
        private val api5 = Feature10Api()
        private val api6 = Feature11Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 37"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
            api6.fetchData()
        }
    }
}

class Feature37Api {
    suspend fun fetchData(): String {
        return "Data from Feature 37 API"
    }
}
