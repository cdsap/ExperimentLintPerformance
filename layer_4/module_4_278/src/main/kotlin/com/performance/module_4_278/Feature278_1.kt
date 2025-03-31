package com.performance.module_4_278

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_249.Feature249Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_257.Feature257Repository

class Feature278ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature265Repository()
        private val repository1 = Feature245Repository()
        private val repository2 = Feature260Repository()
        private val repository3 = Feature263Repository()
        private val repository4 = Feature259Repository()
        private val repository5 = Feature246Repository()
        private val repository6 = Feature274Repository()
        private val repository7 = Feature266Repository()
        private val repository8 = Feature249Repository()
        private val repository9 = Feature258Repository()
        private val repository10 = Feature257Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 278"
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
