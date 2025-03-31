package com.performance.module_4_78

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_62.Feature62Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_73.Feature73Repository
import com.performance.module_3_58.Feature58Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_56.Feature56Repository

class Feature78ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature62Repository()
        private val repository1 = Feature55Repository()
        private val repository2 = Feature73Repository()
        private val repository3 = Feature58Repository()
        private val repository4 = Feature74Repository()
        private val repository5 = Feature56Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 78"
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
