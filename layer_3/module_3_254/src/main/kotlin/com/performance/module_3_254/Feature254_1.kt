package com.performance.module_3_254

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_223.Feature223Repository
import com.performance.module_2_239.Feature239Repository
import com.performance.module_2_200.Feature200Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_233.Feature233Repository
import com.performance.module_2_241.Feature241Repository
import com.performance.module_2_225.Feature225Repository

class Feature254ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature223Repository()
        private val repository1 = Feature239Repository()
        private val repository2 = Feature200Repository()
        private val repository3 = Feature203Repository()
        private val repository4 = Feature233Repository()
        private val repository5 = Feature241Repository()
        private val repository6 = Feature225Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 254"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
            }
        }
    }
}
