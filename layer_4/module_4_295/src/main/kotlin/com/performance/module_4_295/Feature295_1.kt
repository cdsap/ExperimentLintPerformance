package com.performance.module_4_295

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_262.Feature262Repository

class Feature295ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature274Repository()
        private val repository1 = Feature250Repository()
        private val repository2 = Feature243Repository()
        private val repository3 = Feature248Repository()
        private val repository4 = Feature259Repository()
        private val repository5 = Feature270Repository()
        private val repository6 = Feature271Repository()
        private val repository7 = Feature254Repository()
        private val repository8 = Feature264Repository()
        private val repository9 = Feature262Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 295"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
                repository9.getData()
            }
        }
    }
}
