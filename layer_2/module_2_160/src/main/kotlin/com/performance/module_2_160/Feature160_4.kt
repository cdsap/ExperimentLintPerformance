package com.performance.module_2_160

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_95.Feature95Api
import com.performance.module_1_102.Feature102Api
import com.performance.module_1_123.Feature123Api
import com.performance.module_1_124.Feature124Api
import com.performance.module_1_103.Feature103Api
import com.performance.module_1_93.Feature93Api

class Feature160Repository {
    
        private val api0 = Feature95Api()
        private val api1 = Feature102Api()
        private val api2 = Feature123Api()
        private val api3 = Feature124Api()
        private val api4 = Feature103Api()
        private val api5 = Feature93Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 160"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature160Api {
    suspend fun fetchData(): String {
        return "Data from Feature 160 API"
    }
}
