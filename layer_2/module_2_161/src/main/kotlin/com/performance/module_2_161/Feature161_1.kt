package com.performance.module_2_161

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_130.Feature130Repository
import com.performance.module_1_120.Feature120Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_105.Feature105Repository
import com.performance.module_1_94.Feature94Repository

class Feature161ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature130Repository()
        private val repository1 = Feature120Repository()
        private val repository2 = Feature115Repository()
        private val repository3 = Feature105Repository()
        private val repository4 = Feature94Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 161"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
