package com.performance.module_1_46

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_11.Feature11Api
import com.performance.module_0_7.Feature7Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_10.Feature10Api
import com.performance.module_0_14.Feature14Api

class Feature46Repository {

        private val api0 = Feature3Api()
        private val api1 = Feature11Api()
        private val api2 = Feature7Api()
        private val api3 = Feature6Api()
        private val api4 = Feature10Api()
        private val api5 = Feature14Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Fessssssature 46"
            api0.fetchData()
            api5.fetchData()
        }
    }
}

class Feature46Api {
    suspend fun fetchData(): String {
        return "Data from Feature 46 API"
    }
}
