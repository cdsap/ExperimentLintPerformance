package com.performance.module_2_242

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_198.Feature198Repository
import com.performance.module_1_134.Feature134Repository
import com.performance.module_1_142.Feature142Repository

class Feature242ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature198Repository()
        private val repository1 = Feature134Repository()
        private val repository2 = Feature142Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 242"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
