package com.performance.module_1_107

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_31.Feature31Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_38.Feature38Repository
import com.performance.module_0_21.Feature21Repository
import com.performance.module_0_32.Feature32Repository
import com.performance.module_0_36.Feature36Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_88.Feature88Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_76.Feature76Repository

class Feature107ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature31Repository()
        private val repository1 = Feature13Repository()
        private val repository2 = Feature38Repository()
        private val repository3 = Feature21Repository()
        private val repository4 = Feature32Repository()
        private val repository5 = Feature36Repository()
        private val repository6 = Feature2Repository()
        private val repository7 = Feature88Repository()
        private val repository8 = Feature64Repository()
        private val repository9 = Feature61Repository()
        private val repository10 = Feature12Repository()
        private val repository11 = Feature76Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 107"
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
                repository10.getData()
                repository11.getData()
            }
        }
    }
}
