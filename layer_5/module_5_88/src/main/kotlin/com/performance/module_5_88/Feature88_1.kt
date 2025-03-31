package com.performance.module_5_88

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_4_83.Feature83Repository
import com.performance.module_4_77.Feature77Repository
import com.performance.module_4_86.Feature86Repository
import com.performance.module_4_78.Feature78Repository
import com.performance.module_4_84.Feature84Repository
import com.performance.module_4_80.Feature80Repository

class Feature88ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature83Repository()
        private val repository1 = Feature77Repository()
        private val repository2 = Feature86Repository()
        private val repository3 = Feature78Repository()
        private val repository4 = Feature84Repository()
        private val repository5 = Feature80Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 88"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
            }
        }
    }
}
