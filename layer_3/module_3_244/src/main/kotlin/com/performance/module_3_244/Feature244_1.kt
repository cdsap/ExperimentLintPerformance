package com.performance.module_3_244

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_237.Feature237Repository
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_236.Feature236Repository
import com.performance.module_2_229.Feature229Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_214.Feature214Repository

class Feature244ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature237Repository()
        private val repository1 = Feature208Repository()
        private val repository2 = Feature232Repository()
        private val repository3 = Feature236Repository()
        private val repository4 = Feature229Repository()
        private val repository5 = Feature227Repository()
        private val repository6 = Feature230Repository()
        private val repository7 = Feature228Repository()
        private val repository8 = Feature203Repository()
        private val repository9 = Feature214Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 244"
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
