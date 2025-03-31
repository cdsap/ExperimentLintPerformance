package com.performance.module_3_181

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_139.Feature139Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_150.Feature150Repository

class Feature181ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature137Repository()
        private val repository1 = Feature139Repository()
        private val repository2 = Feature156Repository()
        private val repository3 = Feature134Repository()
        private val repository4 = Feature153Repository()
        private val repository5 = Feature150Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 181"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
            }
        }
    }
}
