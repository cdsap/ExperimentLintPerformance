package com.performance.module_2_145

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_92.Feature92Repository
import com.performance.module_1_123.Feature123Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_114.Feature114Repository
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_98.Feature98Repository
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_125.Feature125Repository
import com.performance.module_1_94.Feature94Repository
import com.performance.module_1_108.Feature108Repository

class Feature145ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature92Repository()
        private val repository1 = Feature123Repository()
        private val repository2 = Feature132Repository()
        private val repository3 = Feature116Repository()
        private val repository4 = Feature114Repository()
        private val repository5 = Feature129Repository()
        private val repository6 = Feature98Repository()
        private val repository7 = Feature102Repository()
        private val repository8 = Feature110Repository()
        private val repository9 = Feature125Repository()
        private val repository10 = Feature94Repository()
        private val repository11 = Feature108Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 145"
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
