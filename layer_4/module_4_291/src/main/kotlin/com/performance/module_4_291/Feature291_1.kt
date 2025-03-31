package com.performance.module_4_291

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_269.Feature269Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_253.Feature253Repository

class Feature291ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature261Repository()
        private val repository1 = Feature246Repository()
        private val repository2 = Feature258Repository()
        private val repository3 = Feature266Repository()
        private val repository4 = Feature269Repository()
        private val repository5 = Feature254Repository()
        private val repository6 = Feature250Repository()
        private val repository7 = Feature253Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 291"
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
