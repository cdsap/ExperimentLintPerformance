package com.performance.module_2_151

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_97.Feature97Repository
import com.performance.module_1_108.Feature108Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_125.Feature125Repository
import com.performance.module_1_131.Feature131Repository
import com.performance.module_1_98.Feature98Repository

class Feature151ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature97Repository()
        private val repository1 = Feature108Repository()
        private val repository2 = Feature115Repository()
        private val repository3 = Feature125Repository()
        private val repository4 = Feature131Repository()
        private val repository5 = Feature98Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 151"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
            }
        }
    }
}
