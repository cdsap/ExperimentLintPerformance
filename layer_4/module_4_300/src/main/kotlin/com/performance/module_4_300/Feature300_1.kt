package com.performance.module_4_300

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_252.Feature252Repository
import com.performance.module_3_256.Feature256Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_253.Feature253Repository

class Feature300ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature267Repository()
        private val repository1 = Feature268Repository()
        private val repository2 = Feature273Repository()
        private val repository3 = Feature245Repository()
        private val repository4 = Feature262Repository()
        private val repository5 = Feature250Repository()
        private val repository6 = Feature261Repository()
        private val repository7 = Feature244Repository()
        private val repository8 = Feature247Repository()
        private val repository9 = Feature252Repository()
        private val repository10 = Feature256Repository()
        private val repository11 = Feature246Repository()
        private val repository12 = Feature253Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 300"
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
            }
        }
    }
}
