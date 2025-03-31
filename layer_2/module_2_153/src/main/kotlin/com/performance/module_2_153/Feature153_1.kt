package com.performance.module_2_153

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_101.Feature101Repository
import com.performance.module_1_91.Feature91Repository
import com.performance.module_1_122.Feature122Repository
import com.performance.module_1_100.Feature100Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_121.Feature121Repository
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_115.Feature115Repository

class Feature153ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature101Repository()
        private val repository1 = Feature91Repository()
        private val repository2 = Feature122Repository()
        private val repository3 = Feature100Repository()
        private val repository4 = Feature110Repository()
        private val repository5 = Feature109Repository()
        private val repository6 = Feature121Repository()
        private val repository7 = Feature129Repository()
        private val repository8 = Feature132Repository()
        private val repository9 = Feature115Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 153"
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
