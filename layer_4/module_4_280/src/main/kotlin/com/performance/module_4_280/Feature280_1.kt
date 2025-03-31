package com.performance.module_4_280

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_244.Feature244Repository

class Feature280ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature267Repository()
        private val repository1 = Feature272Repository()
        private val repository2 = Feature257Repository()
        private val repository3 = Feature268Repository()
        private val repository4 = Feature248Repository()
        private val repository5 = Feature247Repository()
        private val repository6 = Feature258Repository()
        private val repository7 = Feature244Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 280"
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
