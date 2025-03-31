package com.performance.module_4_76

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_50.Feature50Repository
import com.performance.module_3_67.Feature67Repository
import com.performance.module_3_62.Feature62Repository
import com.performance.module_3_66.Feature66Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_53.Feature53Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_60.Feature60Repository
import com.performance.module_3_58.Feature58Repository
import com.performance.module_3_61.Feature61Repository

class Feature76ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature50Repository()
        private val repository1 = Feature67Repository()
        private val repository2 = Feature62Repository()
        private val repository3 = Feature66Repository()
        private val repository4 = Feature63Repository()
        private val repository5 = Feature53Repository()
        private val repository6 = Feature55Repository()
        private val repository7 = Feature74Repository()
        private val repository8 = Feature60Repository()
        private val repository9 = Feature58Repository()
        private val repository10 = Feature61Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 76"
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
            }
        }
    }
}
