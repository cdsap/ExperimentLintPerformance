package com.performance.module_2_211

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_146.Feature146Repository
import com.performance.module_1_161.Feature161Repository

class Feature211ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature136Repository()
        private val repository1 = Feature163Repository()
        private val repository2 = Feature138Repository()
        private val repository3 = Feature146Repository()
        private val repository4 = Feature161Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 211"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
