package com.performance.module_2_207

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_135.Feature135Repository
import com.performance.module_1_134.Feature134Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_141.Feature141Repository

class Feature207ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature155Repository()
        private val repository1 = Feature135Repository()
        private val repository2 = Feature134Repository()
        private val repository3 = Feature182Repository()
        private val repository4 = Feature136Repository()
        private val repository5 = Feature189Repository()
        private val repository6 = Feature148Repository()
        private val repository7 = Feature150Repository()
        private val repository8 = Feature141Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 207"
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
