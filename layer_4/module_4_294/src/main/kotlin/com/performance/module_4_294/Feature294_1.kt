package com.performance.module_4_294

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_259.Feature259Repository

class Feature294ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature266Repository()
        private val repository1 = Feature244Repository()
        private val repository2 = Feature259Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 294"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
