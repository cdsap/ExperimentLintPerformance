package com.performance.module_2_204

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_143.Feature143Repository
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_170.Feature170Repository

class Feature204ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature174Repository()
        private val repository1 = Feature154Repository()
        private val repository2 = Feature155Repository()
        private val repository3 = Feature183Repository()
        private val repository4 = Feature148Repository()
        private val repository5 = Feature138Repository()
        private val repository6 = Feature189Repository()
        private val repository7 = Feature143Repository()
        private val repository8 = Feature178Repository()
        private val repository9 = Feature170Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 204"
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
