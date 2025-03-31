package com.performance.module_1_181

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_104.Feature104Repository
import com.performance.module_0_86.Feature86Repository
import com.performance.module_0_87.Feature87Repository
import com.performance.module_0_130.Feature130Repository
import com.performance.module_0_58.Feature58Repository
import com.performance.module_0_126.Feature126Repository
import com.performance.module_0_25.Feature25Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_107.Feature107Repository

class Feature181ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature104Repository()
        private val repository1 = Feature86Repository()
        private val repository2 = Feature87Repository()
        private val repository3 = Feature130Repository()
        private val repository4 = Feature58Repository()
        private val repository5 = Feature126Repository()
        private val repository6 = Feature25Repository()
        private val repository7 = Feature4Repository()
        private val repository8 = Feature107Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 181"
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
