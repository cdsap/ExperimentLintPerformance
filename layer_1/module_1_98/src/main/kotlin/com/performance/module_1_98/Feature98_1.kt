package com.performance.module_1_98

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_70.Feature70Repository
import com.performance.module_0_40.Feature40Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_5.Feature5Repository
import com.performance.module_0_63.Feature63Repository
import com.performance.module_0_31.Feature31Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_75.Feature75Repository

class Feature98ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature70Repository()
        private val repository1 = Feature40Repository()
        private val repository2 = Feature33Repository()
        private val repository3 = Feature5Repository()
        private val repository4 = Feature63Repository()
        private val repository5 = Feature31Repository()
        private val repository6 = Feature64Repository()
        private val repository7 = Feature75Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 98"
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
