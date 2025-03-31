package com.performance.module_2_208

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_198.Feature198Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_141.Feature141Repository
import com.performance.module_1_169.Feature169Repository
import com.performance.module_1_133.Feature133Repository

class Feature208ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature192Repository()
        private val repository1 = Feature198Repository()
        private val repository2 = Feature150Repository()
        private val repository3 = Feature136Repository()
        private val repository4 = Feature147Repository()
        private val repository5 = Feature170Repository()
        private val repository6 = Feature168Repository()
        private val repository7 = Feature141Repository()
        private val repository8 = Feature169Repository()
        private val repository9 = Feature133Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 208"
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
            }
        }
    }
}
