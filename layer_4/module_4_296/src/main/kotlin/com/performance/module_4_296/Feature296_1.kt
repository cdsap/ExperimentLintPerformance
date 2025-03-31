package com.performance.module_4_296

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_253.Feature253Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_252.Feature252Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_247.Feature247Repository

class Feature296ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature266Repository()
        private val repository1 = Feature253Repository()
        private val repository2 = Feature260Repository()
        private val repository3 = Feature258Repository()
        private val repository4 = Feature259Repository()
        private val repository5 = Feature257Repository()
        private val repository6 = Feature273Repository()
        private val repository7 = Feature274Repository()
        private val repository8 = Feature254Repository()
        private val repository9 = Feature252Repository()
        private val repository10 = Feature261Repository()
        private val repository11 = Feature247Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 296"
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
