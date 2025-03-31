package com.performance.module_3_256

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_233.Feature233Repository

class Feature256ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature204Repository()
        private val repository1 = Feature232Repository()
        private val repository2 = Feature203Repository()
        private val repository3 = Feature219Repository()
        private val repository4 = Feature215Repository()
        private val repository5 = Feature233Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 256"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
            }
        }
    }
}
