package com.performance.module_4_77

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_65.Feature65Repository
import com.performance.module_3_73.Feature73Repository
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_57.Feature57Repository
import com.performance.module_3_49.Feature49Repository

class Feature77ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature65Repository()
        private val repository1 = Feature73Repository()
        private val repository2 = Feature68Repository()
        private val repository3 = Feature57Repository()
        private val repository4 = Feature49Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 77"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
            }
        }
    }
}
