package com.performance.module_5_88

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_4_81.Feature81Api
import com.performance.module_4_75.Feature75Api
import com.performance.module_4_78.Feature78Api
import com.performance.module_4_87.Feature87Api
import com.performance.module_4_79.Feature79Api
import com.performance.module_4_83.Feature83Api

class Feature88Repository {
    
        private val api0 = Feature81Api()
        private val api1 = Feature75Api()
        private val api2 = Feature78Api()
        private val api3 = Feature87Api()
        private val api4 = Feature79Api()
        private val api5 = Feature83Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 88"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
            api5.fetchData()
        }
    }
}

class Feature88Api {
    suspend fun fetchData(): String {
        return "Data from Feature 88 API"
    }
}
