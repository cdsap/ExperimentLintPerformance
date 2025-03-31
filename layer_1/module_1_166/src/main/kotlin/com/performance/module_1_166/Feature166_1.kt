package com.performance.module_1_166

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_63.Feature63Repository
import com.performance.module_0_77.Feature77Repository
import com.performance.module_0_125.Feature125Repository
import com.performance.module_0_99.Feature99Repository

class Feature166ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature11Repository()
        private val repository1 = Feature63Repository()
        private val repository2 = Feature77Repository()
        private val repository3 = Feature125Repository()
        private val repository4 = Feature99Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 166"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
