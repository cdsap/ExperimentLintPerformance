package com.performance.module_3_260

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_223.Feature223Api
import com.performance.module_2_206.Feature206Api
import com.performance.module_2_240.Feature240Api
import com.performance.module_2_204.Feature204Api
import com.performance.module_2_201.Feature201Api

class Feature260Repository {
    
        private val api0 = Feature223Api()
        private val api1 = Feature206Api()
        private val api2 = Feature240Api()
        private val api3 = Feature204Api()
        private val api4 = Feature201Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 260"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature260Api {
    suspend fun fetchData(): String {
        return "Data from Feature 260 API"
    }
}
