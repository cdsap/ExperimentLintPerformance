package com.performance.module_2_226

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_141.Feature141Repository
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_134.Feature134Repository
import com.performance.module_1_187.Feature187Repository

class Feature226ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature193Repository()
        private val repository1 = Feature141Repository()
        private val repository2 = Feature168Repository()
        private val repository3 = Feature159Repository()
        private val repository4 = Feature134Repository()
        private val repository5 = Feature187Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 226"
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
