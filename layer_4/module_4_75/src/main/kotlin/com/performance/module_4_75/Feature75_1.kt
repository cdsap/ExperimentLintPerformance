package com.performance.module_4_75

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_53.Feature53Repository
import com.performance.module_3_58.Feature58Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_52.Feature52Repository
import com.performance.module_3_51.Feature51Repository
import com.performance.module_3_50.Feature50Repository

class Feature75ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature68Repository()
        private val repository1 = Feature64Repository()
        private val repository2 = Feature53Repository()
        private val repository3 = Feature58Repository()
        private val repository4 = Feature74Repository()
        private val repository5 = Feature63Repository()
        private val repository6 = Feature52Repository()
        private val repository7 = Feature51Repository()
        private val repository8 = Feature50Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 75"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
            }
        }
    }
}
