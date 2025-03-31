package com.performance.module_1_177

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_59.Feature59Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_108.Feature108Repository
import com.performance.module_0_60.Feature60Repository
import com.performance.module_0_27.Feature27Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_45.Feature45Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_54.Feature54Repository
import com.performance.module_0_119.Feature119Repository

class Feature177ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature59Repository()
        private val repository1 = Feature17Repository()
        private val repository2 = Feature108Repository()
        private val repository3 = Feature60Repository()
        private val repository4 = Feature27Repository()
        private val repository5 = Feature13Repository()
        private val repository6 = Feature45Repository()
        private val repository7 = Feature56Repository()
        private val repository8 = Feature33Repository()
        private val repository9 = Feature54Repository()
        private val repository10 = Feature119Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 177"
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
            }
        }
    }
}
