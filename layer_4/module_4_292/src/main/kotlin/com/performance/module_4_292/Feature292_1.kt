package com.performance.module_4_292

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_269.Feature269Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_251.Feature251Repository

class Feature292ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature269Repository()
        private val repository1 = Feature266Repository()
        private val repository2 = Feature243Repository()
        private val repository3 = Feature259Repository()
        private val repository4 = Feature267Repository()
        private val repository5 = Feature251Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 292"
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
