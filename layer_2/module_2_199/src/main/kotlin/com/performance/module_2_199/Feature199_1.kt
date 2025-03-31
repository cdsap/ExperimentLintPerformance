package com.performance.module_2_199

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_181.Feature181Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_159.Feature159Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_160.Feature160Repository

class Feature199ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature181Repository()
        private val repository1 = Feature189Repository()
        private val repository2 = Feature159Repository()
        private val repository3 = Feature193Repository()
        private val repository4 = Feature160Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 199"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
