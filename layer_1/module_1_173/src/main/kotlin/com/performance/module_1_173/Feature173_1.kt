package com.performance.module_1_173

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_0_78.Feature78Repository
import com.performance.module_0_112.Feature112Repository
import com.performance.module_0_124.Feature124Repository
import com.performance.module_0_18.Feature18Repository
import com.performance.module_0_76.Feature76Repository
import com.performance.module_0_2.Feature2Repository

class Feature173ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature78Repository()
        private val repository1 = Feature112Repository()
        private val repository2 = Feature124Repository()
        private val repository3 = Feature18Repository()
        private val repository4 = Feature76Repository()
        private val repository5 = Feature2Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 173"
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
