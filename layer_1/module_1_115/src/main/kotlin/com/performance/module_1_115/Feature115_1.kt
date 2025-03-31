package com.performance.module_1_115

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_75.Feature75Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_60.Feature60Repository
import com.performance.module_0_73.Feature73Repository
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_71.Feature71Repository
import com.performance.module_0_32.Feature32Repository

class Feature115ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature2Repository()
        private val repository1 = Feature81Repository()
        private val repository2 = Feature75Repository()
        private val repository3 = Feature7Repository()
        private val repository4 = Feature33Repository()
        private val repository5 = Feature60Repository()
        private val repository6 = Feature73Repository()
        private val repository7 = Feature35Repository()
        private val repository8 = Feature71Repository()
        private val repository9 = Feature32Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 115"
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
