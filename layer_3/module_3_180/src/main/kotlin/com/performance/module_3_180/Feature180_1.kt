package com.performance.module_3_180

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_135.Feature135Repository

class Feature180ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature137Repository()
        private val repository1 = Feature149Repository()
        private val repository2 = Feature135Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 180"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
