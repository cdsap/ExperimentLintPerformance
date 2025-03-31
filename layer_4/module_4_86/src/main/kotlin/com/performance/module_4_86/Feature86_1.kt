package com.performance.module_4_86

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_57.Feature57Repository

class Feature86ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature64Repository()
        private val repository1 = Feature68Repository()
        private val repository2 = Feature57Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 86"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
