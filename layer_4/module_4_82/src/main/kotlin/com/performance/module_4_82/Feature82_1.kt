package com.performance.module_4_82

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_61.Feature61Repository
import com.performance.module_3_53.Feature53Repository
import com.performance.module_3_66.Feature66Repository
import com.performance.module_3_65.Feature65Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_69.Feature69Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_70.Feature70Repository
import com.performance.module_3_54.Feature54Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_60.Feature60Repository

class Feature82ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature64Repository()
        private val repository1 = Feature61Repository()
        private val repository2 = Feature53Repository()
        private val repository3 = Feature66Repository()
        private val repository4 = Feature65Repository()
        private val repository5 = Feature63Repository()
        private val repository6 = Feature69Repository()
        private val repository7 = Feature74Repository()
        private val repository8 = Feature70Repository()
        private val repository9 = Feature54Repository()
        private val repository10 = Feature55Repository()
        private val repository11 = Feature60Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 82"
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
