package com.performance.module_3_255

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_233.Feature233Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_236.Feature236Repository

class Feature255ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature211Repository()
        private val repository1 = Feature199Repository()
        private val repository2 = Feature222Repository()
        private val repository3 = Feature208Repository()
        private val repository4 = Feature203Repository()
        private val repository5 = Feature233Repository()
        private val repository6 = Feature202Repository()
        private val repository7 = Feature219Repository()
        private val repository8 = Feature227Repository()
        private val repository9 = Feature215Repository()
        private val repository10 = Feature228Repository()
        private val repository11 = Feature236Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 255"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
                repository9.getData()
                repository10.getData()
                repository11.getData()
            }
        }
    }
}
