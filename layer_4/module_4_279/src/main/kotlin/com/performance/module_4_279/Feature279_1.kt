package com.performance.module_4_279

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_253.Feature253Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_265.Feature265Repository

class Feature279ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature257Repository()
        private val repository1 = Feature245Repository()
        private val repository2 = Feature247Repository()
        private val repository3 = Feature253Repository()
        private val repository4 = Feature261Repository()
        private val repository5 = Feature254Repository()
        private val repository6 = Feature266Repository()
        private val repository7 = Feature268Repository()
        private val repository8 = Feature250Repository()
        private val repository9 = Feature265Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 279"
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
