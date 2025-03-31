package com.performance.module_2_228

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_161.Feature161Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_165.Feature165Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_149.Feature149Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_190.Feature190Repository

class Feature228ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature161Repository()
        private val repository1 = Feature144Repository()
        private val repository2 = Feature139Repository()
        private val repository3 = Feature165Repository()
        private val repository4 = Feature138Repository()
        private val repository5 = Feature149Repository()
        private val repository6 = Feature183Repository()
        private val repository7 = Feature136Repository()
        private val repository8 = Feature190Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 228"
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
