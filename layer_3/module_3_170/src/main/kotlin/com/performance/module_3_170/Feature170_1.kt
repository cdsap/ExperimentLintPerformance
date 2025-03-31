package com.performance.module_3_170

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_161.Feature161Repository
import com.performance.module_2_154.Feature154Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_157.Feature157Repository
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_160.Feature160Repository

class Feature170ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature158Repository()
        private val repository1 = Feature161Repository()
        private val repository2 = Feature154Repository()
        private val repository3 = Feature156Repository()
        private val repository4 = Feature157Repository()
        private val repository5 = Feature145Repository()
        private val repository6 = Feature148Repository()
        private val repository7 = Feature160Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 170"
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
