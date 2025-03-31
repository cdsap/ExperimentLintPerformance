package com.performance.module_2_161

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_107.Feature107Api
import com.performance.module_1_105.Feature105Api
import com.performance.module_1_89.Feature89Api
import com.performance.module_1_115.Feature115Api
import com.performance.module_1_108.Feature108Api

class Feature161Repository {
    
        private val api0 = Feature107Api()
        private val api1 = Feature105Api()
        private val api2 = Feature89Api()
        private val api3 = Feature115Api()
        private val api4 = Feature108Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 161"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature161Api {
    suspend fun fetchData(): String {
        return "Data from Feature 161 API"
    }
}
