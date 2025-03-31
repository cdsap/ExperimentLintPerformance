package com.performance.module_1_20

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_15.Feature15Repository

class Feature20ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature7Repository()
        private val repository1 = Feature4Repository()
        private val repository2 = Feature15Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 20"
                repository0.getData()
                repository1.getData()
                repository2.getData()
            }
        }
    }
}
