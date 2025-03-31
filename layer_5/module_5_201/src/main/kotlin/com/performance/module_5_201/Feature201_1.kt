package com.performance.module_5_201

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_4_199.Feature199Repository
import com.performance.module_4_193.Feature193Repository
import com.performance.module_4_187.Feature187Repository
import com.performance.module_4_188.Feature188Repository
import com.performance.module_4_190.Feature190Repository
import com.performance.module_4_196.Feature196Repository
import com.performance.module_4_194.Feature194Repository
import com.performance.module_4_184.Feature184Repository

class Feature201ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature199Repository()
        private val repository1 = Feature193Repository()
        private val repository2 = Feature187Repository()
        private val repository3 = Feature188Repository()
        private val repository4 = Feature190Repository()
        private val repository5 = Feature196Repository()
        private val repository6 = Feature194Repository()
        private val repository7 = Feature184Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 201"
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
