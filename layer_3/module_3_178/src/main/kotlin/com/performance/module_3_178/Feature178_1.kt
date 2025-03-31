package com.performance.module_3_178

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_151.Feature151Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_141.Feature141Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_161.Feature161Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_160.Feature160Repository

class Feature178ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature151Repository()
        private val repository1 = Feature149Repository()
        private val repository2 = Feature144Repository()
        private val repository3 = Feature141Repository()
        private val repository4 = Feature135Repository()
        private val repository5 = Feature147Repository()
        private val repository6 = Feature152Repository()
        private val repository7 = Feature161Repository()
        private val repository8 = Feature133Repository()
        private val repository9 = Feature160Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 178"
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
