package com.performance.module_3_169

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_143.Feature143Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_146.Feature146Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_134.Feature134Repository

class Feature169ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature160Repository()
        private val repository1 = Feature143Repository()
        private val repository2 = Feature147Repository()
        private val repository3 = Feature138Repository()
        private val repository4 = Feature148Repository()
        private val repository5 = Feature146Repository()
        private val repository6 = Feature144Repository()
        private val repository7 = Feature134Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 169"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
            }
        }
    }
}
