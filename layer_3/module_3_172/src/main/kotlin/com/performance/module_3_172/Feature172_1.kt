package com.performance.module_3_172

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_159.Feature159Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_154.Feature154Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_133.Feature133Repository

class Feature172ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature138Repository()
        private val repository1 = Feature159Repository()
        private val repository2 = Feature149Repository()
        private val repository3 = Feature154Repository()
        private val repository4 = Feature156Repository()
        private val repository5 = Feature147Repository()
        private val repository6 = Feature137Repository()
        private val repository7 = Feature160Repository()
        private val repository8 = Feature150Repository()
        private val repository9 = Feature153Repository()
        private val repository10 = Feature133Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 172"
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
                repository10.getData()
            }
        }
    }
}
