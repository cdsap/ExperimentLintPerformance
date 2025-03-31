package com.performance.module_1_105

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_75.Feature75Repository
import com.performance.module_0_48.Feature48Repository
import com.performance.module_0_25.Feature25Repository
import com.performance.module_0_57.Feature57Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_46.Feature46Repository
import com.performance.module_0_18.Feature18Repository
import com.performance.module_0_22.Feature22Repository
import com.performance.module_0_78.Feature78Repository
import com.performance.module_0_13.Feature13Repository

class Feature105ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature56Repository()
        private val repository1 = Feature10Repository()
        private val repository2 = Feature75Repository()
        private val repository3 = Feature48Repository()
        private val repository4 = Feature25Repository()
        private val repository5 = Feature57Repository()
        private val repository6 = Feature17Repository()
        private val repository7 = Feature46Repository()
        private val repository8 = Feature18Repository()
        private val repository9 = Feature22Repository()
        private val repository10 = Feature78Repository()
        private val repository11 = Feature13Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 105"
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
