package com.performance.module_1_116

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_67.Feature67Repository
import com.performance.module_0_43.Feature43Repository
import com.performance.module_0_69.Feature69Repository
import com.performance.module_0_46.Feature46Repository
import com.performance.module_0_57.Feature57Repository
import com.performance.module_0_77.Feature77Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_2.Feature2Repository

class Feature116ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature67Repository()
        private val repository1 = Feature43Repository()
        private val repository2 = Feature69Repository()
        private val repository3 = Feature46Repository()
        private val repository4 = Feature57Repository()
        private val repository5 = Feature77Repository()
        private val repository6 = Feature56Repository()
        private val repository7 = Feature2Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 116"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
            }
        }
    }
}
