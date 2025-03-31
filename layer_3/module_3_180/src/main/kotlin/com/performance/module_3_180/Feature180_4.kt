package com.performance.module_3_180

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_140.Feature140Api
import com.performance.module_2_137.Feature137Api
import com.performance.module_2_149.Feature149Api

class Feature180Repository {
    
        private val api0 = Feature140Api()
        private val api1 = Feature137Api()
        private val api2 = Feature149Api()


    suspend fun getData(): String {
        return withContext(Dispatchers.IO) {
            "Data from Feature 180"
            api0.fetchData()
            api1.fetchData()
            api2.fetchData()
        }
    }
}

class Feature180Api {
    suspend fun fetchData(): String {
        return "Data from Feature 180 API"
    }
}
