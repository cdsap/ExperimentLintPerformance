package com.performance.module_1_135

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_108.Feature108Repository
import com.performance.module_0_19.Feature19Repository
import com.performance.module_0_120.Feature120Repository
import com.performance.module_0_60.Feature60Repository
import com.performance.module_0_126.Feature126Repository
import com.performance.module_0_105.Feature105Repository
import com.performance.module_0_79.Feature79Repository
import com.performance.module_0_85.Feature85Repository

class Feature135ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature108Repository()
        private val repository1 = Feature19Repository()
        private val repository2 = Feature120Repository()
        private val repository3 = Feature60Repository()
        private val repository4 = Feature126Repository()
        private val repository5 = Feature105Repository()
        private val repository6 = Feature79Repository()
        private val repository7 = Feature85Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 135"
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
