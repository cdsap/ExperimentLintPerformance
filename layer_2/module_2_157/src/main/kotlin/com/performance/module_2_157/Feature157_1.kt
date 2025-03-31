package com.performance.module_2_157

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_112.Feature112Repository
import com.performance.module_1_104.Feature104Repository
import com.performance.module_1_118.Feature118Repository

class Feature157ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature112Repository()
        private val repository1 = Feature104Repository()
        private val repository2 = Feature118Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 157"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
