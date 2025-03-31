package com.performance.module_2_211

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_164.Feature164Api
import com.performance.module_1_180.Feature180Api
import com.performance.module_1_135.Feature135Api
import com.performance.module_1_136.Feature136Api
import com.performance.module_1_146.Feature146Api

class Feature211Repository {
    
        private val api0 = Feature164Api()
        private val api1 = Feature180Api()
        private val api2 = Feature135Api()
        private val api3 = Feature136Api()
        private val api4 = Feature146Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 211"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature211Api {
    suspend fun fetchData(): String {
        return "Data from Feature 211 API"
    }
}
