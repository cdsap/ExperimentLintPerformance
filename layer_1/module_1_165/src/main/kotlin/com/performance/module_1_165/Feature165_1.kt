package com.performance.module_1_165

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_131.Feature131Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_32.Feature32Repository
import com.performance.module_0_88.Feature88Repository
import com.performance.module_0_29.Feature29Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_116.Feature116Repository

class Feature165ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature131Repository()
        private val repository1 = Feature61Repository()
        private val repository2 = Feature14Repository()
        private val repository3 = Feature32Repository()
        private val repository4 = Feature88Repository()
        private val repository5 = Feature29Repository()
        private val repository6 = Feature11Repository()
        private val repository7 = Feature116Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 165"
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
