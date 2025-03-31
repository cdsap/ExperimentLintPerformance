package com.performance.module_3_257

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_230.Feature230Repository

class Feature257ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature208Repository()
        private val repository1 = Feature225Repository()
        private val repository2 = Feature212Repository()
        private val repository3 = Feature238Repository()
        private val repository4 = Feature210Repository()
        private val repository5 = Feature213Repository()
        private val repository6 = Feature203Repository()
        private val repository7 = Feature230Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 257"
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
