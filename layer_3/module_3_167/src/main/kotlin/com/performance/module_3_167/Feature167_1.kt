package com.performance.module_3_167

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_142.Feature142Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_149.Feature149Repository

class Feature167ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature138Repository()
        private val repository1 = Feature142Repository()
        private val repository2 = Feature147Repository()
        private val repository3 = Feature153Repository()
        private val repository4 = Feature149Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 167"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
