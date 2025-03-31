package com.performance.module_2_141

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_112.Feature112Repository
import com.performance.module_1_110.Feature110Repository

class Feature141ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature116Repository()
        private val repository1 = Feature90Repository()
        private val repository2 = Feature112Repository()
        private val repository3 = Feature110Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 141"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
            }
        }
    }
}
