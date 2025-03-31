package com.performance.module_1_100

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_37.Feature37Repository
import com.performance.module_0_25.Feature25Repository
import com.performance.module_0_40.Feature40Repository
import com.performance.module_0_80.Feature80Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_43.Feature43Repository
import com.performance.module_0_20.Feature20Repository
import com.performance.module_0_73.Feature73Repository

class Feature100ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature35Repository()
        private val repository1 = Feature56Repository()
        private val repository2 = Feature33Repository()
        private val repository3 = Feature1Repository()
        private val repository4 = Feature37Repository()
        private val repository5 = Feature25Repository()
        private val repository6 = Feature40Repository()
        private val repository7 = Feature80Repository()
        private val repository8 = Feature12Repository()
        private val repository9 = Feature43Repository()
        private val repository10 = Feature20Repository()
        private val repository11 = Feature73Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 100"
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
