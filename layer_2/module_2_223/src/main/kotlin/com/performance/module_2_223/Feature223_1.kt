package com.performance.module_2_223

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_164.Feature164Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_197.Feature197Repository
import com.performance.module_1_155.Feature155Repository

class Feature223ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature188Repository()
        private val repository1 = Feature164Repository()
        private val repository2 = Feature139Repository()
        private val repository3 = Feature197Repository()
        private val repository4 = Feature155Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 223"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
