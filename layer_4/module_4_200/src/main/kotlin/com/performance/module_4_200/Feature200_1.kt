package com.performance.module_4_200

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_177.Feature177Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_173.Feature173Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_163.Feature163Repository
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_183.Feature183Repository
import com.performance.module_3_165.Feature165Repository
import com.performance.module_3_174.Feature174Repository

class Feature200ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature182Repository()
        private val repository1 = Feature177Repository()
        private val repository2 = Feature179Repository()
        private val repository3 = Feature173Repository()
        private val repository4 = Feature181Repository()
        private val repository5 = Feature163Repository()
        private val repository6 = Feature170Repository()
        private val repository7 = Feature183Repository()
        private val repository8 = Feature165Repository()
        private val repository9 = Feature174Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 200"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
                repository9.getData()
            }
        }
    }
}
