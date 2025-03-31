package com.performance.module_3_167

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_146.Feature146Api
import com.performance.module_2_143.Feature143Api
import com.performance.module_2_147.Feature147Api
import com.performance.module_2_139.Feature139Api
import com.performance.module_2_138.Feature138Api

class Feature167Repository {
    
        private val api0 = Feature146Api()
        private val api1 = Feature143Api()
        private val api2 = Feature147Api()
        private val api3 = Feature139Api()
        private val api4 = Feature138Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 167"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
            api3.fetchData()
            api4.fetchData()
        }
    }
}

class Feature167Api {
    suspend fun fetchData(): String {
        return "Data from Feature 167 API"
    }
}
