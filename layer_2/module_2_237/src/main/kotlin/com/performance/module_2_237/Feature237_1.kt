package com.performance.module_2_237

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_173.Feature173Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_148.Feature148Repository

class Feature237ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature170Repository()
        private val repository1 = Feature142Repository()
        private val repository2 = Feature188Repository()
        private val repository3 = Feature157Repository()
        private val repository4 = Feature173Repository()
        private val repository5 = Feature183Repository()
        private val repository6 = Feature148Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 237"
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
