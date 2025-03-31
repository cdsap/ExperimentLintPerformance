package com.performance.module_2_233

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_172.Feature172Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_188.Feature188Repository

class Feature233ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature172Repository()
        private val repository1 = Feature148Repository()
        private val repository2 = Feature188Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 233"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
