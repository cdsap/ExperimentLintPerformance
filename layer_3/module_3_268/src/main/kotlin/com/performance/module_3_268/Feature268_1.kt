package com.performance.module_3_268

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_233.Feature233Repository
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_239.Feature239Repository

class Feature268ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature233Repository()
        private val repository1 = Feature206Repository()
        private val repository2 = Feature215Repository()
        private val repository3 = Feature217Repository()
        private val repository4 = Feature216Repository()
        private val repository5 = Feature239Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 268"
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
