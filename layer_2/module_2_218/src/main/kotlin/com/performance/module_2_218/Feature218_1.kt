package com.performance.module_2_218

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_186.Feature186Repository
import com.performance.module_1_143.Feature143Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_171.Feature171Repository
import com.performance.module_1_194.Feature194Repository
import com.performance.module_1_166.Feature166Repository
import com.performance.module_1_190.Feature190Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_187.Feature187Repository
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_179.Feature179Repository
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_160.Feature160Repository

class Feature218ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature186Repository()
        private val repository1 = Feature143Repository()
        private val repository2 = Feature154Repository()
        private val repository3 = Feature171Repository()
        private val repository4 = Feature194Repository()
        private val repository5 = Feature166Repository()
        private val repository6 = Feature190Repository()
        private val repository7 = Feature189Repository()
        private val repository8 = Feature150Repository()
        private val repository9 = Feature187Repository()
        private val repository10 = Feature178Repository()
        private val repository11 = Feature179Repository()
        private val repository12 = Feature168Repository()
        private val repository13 = Feature160Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 218"
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
                repository12.getData()
                repository13.getData()
            }
        }
    }
}
