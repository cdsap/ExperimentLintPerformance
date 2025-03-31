package com.performance.module_4_85

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_50.Feature50Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_65.Feature65Repository
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_49.Feature49Repository

class Feature85ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature50Repository()
        private val repository1 = Feature55Repository()
        private val repository2 = Feature74Repository()
        private val repository3 = Feature68Repository()
        private val repository4 = Feature65Repository()
        private val repository5 = Feature64Repository()
        private val repository6 = Feature49Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 85"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
            }
        }
    }
}
