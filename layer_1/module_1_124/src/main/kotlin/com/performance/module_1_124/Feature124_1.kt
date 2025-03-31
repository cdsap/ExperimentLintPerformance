package com.performance.module_1_124

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_26.Feature26Repository
import com.performance.module_0_47.Feature47Repository
import com.performance.module_0_76.Feature76Repository
import com.performance.module_0_86.Feature86Repository
import com.performance.module_0_39.Feature39Repository
import com.performance.module_0_75.Feature75Repository
import com.performance.module_0_57.Feature57Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_79.Feature79Repository
import com.performance.module_0_52.Feature52Repository

class Feature124ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature26Repository()
        private val repository1 = Feature47Repository()
        private val repository2 = Feature76Repository()
        private val repository3 = Feature86Repository()
        private val repository4 = Feature39Repository()
        private val repository5 = Feature75Repository()
        private val repository6 = Feature57Repository()
        private val repository7 = Feature14Repository()
        private val repository8 = Feature79Repository()
        private val repository9 = Feature52Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 124"
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
