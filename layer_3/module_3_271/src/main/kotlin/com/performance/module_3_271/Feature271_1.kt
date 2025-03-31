package com.performance.module_3_271

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_231.Feature231Repository
import com.performance.module_2_214.Feature214Repository

class Feature271ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature199Repository()
        private val repository1 = Feature231Repository()
        private val repository2 = Feature214Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 271"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
