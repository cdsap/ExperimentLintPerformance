package com.performance.module_1_104

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_57.Feature57Repository
import com.performance.module_0_11.Feature11Repository

class Feature104ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature35Repository()
        private val repository1 = Feature57Repository()
        private val repository2 = Feature11Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 104"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
