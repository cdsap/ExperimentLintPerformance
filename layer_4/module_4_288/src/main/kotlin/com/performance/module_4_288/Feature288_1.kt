package com.performance.module_4_288

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_274.Feature274Repository

class Feature288ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature264Repository()
        private val repository1 = Feature248Repository()
        private val repository2 = Feature244Repository()
        private val repository3 = Feature254Repository()
        private val repository4 = Feature255Repository()
        private val repository5 = Feature271Repository()
        private val repository6 = Feature267Repository()
        private val repository7 = Feature258Repository()
        private val repository8 = Feature274Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 288"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
            }
        }
    }
}
