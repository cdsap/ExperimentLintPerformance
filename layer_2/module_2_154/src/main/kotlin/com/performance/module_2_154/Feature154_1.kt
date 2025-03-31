package com.performance.module_2_154

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_89.Feature89Repository
import com.performance.module_1_113.Feature113Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_106.Feature106Repository

class Feature154ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature89Repository()
        private val repository1 = Feature113Repository()
        private val repository2 = Feature110Repository()
        private val repository3 = Feature124Repository()
        private val repository4 = Feature106Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 154"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
