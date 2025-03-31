package com.performance.module_3_174

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_139.Feature139Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_159.Feature159Repository
import com.performance.module_2_155.Feature155Repository

class Feature174ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature133Repository()
        private val repository1 = Feature153Repository()
        private val repository2 = Feature139Repository()
        private val repository3 = Feature134Repository()
        private val repository4 = Feature137Repository()
        private val repository5 = Feature150Repository()
        private val repository6 = Feature159Repository()
        private val repository7 = Feature155Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 174"
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
