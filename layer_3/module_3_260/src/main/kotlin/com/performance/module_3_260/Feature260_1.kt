package com.performance.module_3_260

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_229.Feature229Repository
import com.performance.module_2_231.Feature231Repository
import com.performance.module_2_240.Feature240Repository

class Feature260ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature204Repository()
        private val repository1 = Feature213Repository()
        private val repository2 = Feature229Repository()
        private val repository3 = Feature231Repository()
        private val repository4 = Feature240Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 260"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
