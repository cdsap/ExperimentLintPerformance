package com.performance.module_1_146

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_110.Feature110Repository
import com.performance.module_0_117.Feature117Repository
import com.performance.module_0_47.Feature47Repository
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_103.Feature103Repository
import com.performance.module_0_90.Feature90Repository
import com.performance.module_0_55.Feature55Repository

class Feature146ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature110Repository()
        private val repository1 = Feature117Repository()
        private val repository2 = Feature47Repository()
        private val repository3 = Feature35Repository()
        private val repository4 = Feature103Repository()
        private val repository5 = Feature90Repository()
        private val repository6 = Feature55Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 146"
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
