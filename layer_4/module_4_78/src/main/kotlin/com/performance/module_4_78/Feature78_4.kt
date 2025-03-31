package com.performance.module_4_78

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_50.Feature50Api
import com.performance.module_3_71.Feature71Api
import com.performance.module_3_74.Feature74Api
import com.performance.module_3_55.Feature55Api
import com.performance.module_3_60.Feature60Api
import com.performance.module_3_57.Feature57Api

class Feature78Repository {
    
        private val api0 = Feature50Api()
        private val api1 = Feature71Api()
        private val api2 = Feature74Api()
        private val api3 = Feature55Api()
        private val api4 = Feature60Api()
        private val api5 = Feature57Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 78"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature78Api {
    suspend fun fetchData(): String {
        return "Data from Feature 78 API"
    }
}
