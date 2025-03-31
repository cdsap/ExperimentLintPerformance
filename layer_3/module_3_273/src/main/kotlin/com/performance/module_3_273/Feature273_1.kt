package com.performance.module_3_273

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_209.Feature209Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_235.Feature235Repository
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_218.Feature218Repository
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_213.Feature213Repository

class Feature273ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature209Repository()
        private val repository1 = Feature232Repository()
        private val repository2 = Feature227Repository()
        private val repository3 = Feature235Repository()
        private val repository4 = Feature210Repository()
        private val repository5 = Feature238Repository()
        private val repository6 = Feature212Repository()
        private val repository7 = Feature230Repository()
        private val repository8 = Feature203Repository()
        private val repository9 = Feature201Repository()
        private val repository10 = Feature208Repository()
        private val repository11 = Feature218Repository()
        private val repository12 = Feature211Repository()
        private val repository13 = Feature213Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 273"
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
                repository13.getData()
            }
        }
    }
}
