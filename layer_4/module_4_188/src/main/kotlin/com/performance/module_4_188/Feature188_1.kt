package com.performance.module_4_188

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_163.Feature163Repository
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_167.Feature167Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_177.Feature177Repository
import com.performance.module_3_168.Feature168Repository
import com.performance.module_3_173.Feature173Repository

class Feature188ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature175Repository()
        private val repository1 = Feature163Repository()
        private val repository2 = Feature178Repository()
        private val repository3 = Feature167Repository()
        private val repository4 = Feature181Repository()
        private val repository5 = Feature177Repository()
        private val repository6 = Feature168Repository()
        private val repository7 = Feature173Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 188"
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
