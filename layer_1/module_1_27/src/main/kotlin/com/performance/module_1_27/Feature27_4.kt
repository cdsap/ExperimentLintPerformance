package com.performance.module_1_27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_13.Feature13Api
import com.performance.module_0_8.Feature8Api
import com.performance.module_0_3.Feature3Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_7.Feature7Api

class Feature27Repository {
    
        private val api0 = Feature13Api()
        private val api1 = Feature8Api()
        private val api2 = Feature3Api()
        private val api3 = Feature15Api()
        private val api4 = Feature5Api()
        private val api5 = Feature7Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 27"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature27Api {
    suspend fun fetchData(): String {
        return "Data from Feature 27 API"
    }
}
