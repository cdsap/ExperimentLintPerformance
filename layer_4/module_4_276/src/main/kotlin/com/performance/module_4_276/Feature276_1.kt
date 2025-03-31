package com.performance.module_4_276

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_252.Feature252Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_266.Feature266Repository

class Feature276ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature268Repository()
        private val repository1 = Feature255Repository()
        private val repository2 = Feature260Repository()
        private val repository3 = Feature248Repository()
        private val repository4 = Feature245Repository()
        private val repository5 = Feature263Repository()
        private val repository6 = Feature252Repository()
        private val repository7 = Feature246Repository()
        private val repository8 = Feature270Repository()
        private val repository9 = Feature265Repository()
        private val repository10 = Feature273Repository()
        private val repository11 = Feature261Repository()
        private val repository12 = Feature266Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 276"
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
                repository11.getData()
                repository12.getData()
            }
        }
    }
}
