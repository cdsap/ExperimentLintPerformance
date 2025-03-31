package com.performance.module_1_18

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_5.Feature5Api
import com.performance.module_0_4.Feature4Api
import com.performance.module_0_15.Feature15Api
import com.performance.module_0_8.Feature8Api
import com.performance.module_0_6.Feature6Api
import com.performance.module_0_7.Feature7Api

class Feature18Repository {
    
        private val api0 = Feature5Api()
        private val api1 = Feature4Api()
        private val api2 = Feature15Api()
        private val api3 = Feature8Api()
        private val api4 = Feature6Api()
        private val api5 = Feature7Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 18"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature18Api {
    suspend fun fetchData(): String {
        return "Data from Feature 18 API"
    }
}
