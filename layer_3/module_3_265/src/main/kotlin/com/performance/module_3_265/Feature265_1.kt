package com.performance.module_3_265

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_234.Feature234Repository
import com.performance.module_2_207.Feature207Repository
import com.performance.module_2_241.Feature241Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_238.Feature238Repository

class Feature265ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature210Repository()
        private val repository1 = Feature212Repository()
        private val repository2 = Feature234Repository()
        private val repository3 = Feature207Repository()
        private val repository4 = Feature241Repository()
        private val repository5 = Feature232Repository()
        private val repository6 = Feature219Repository()
        private val repository7 = Feature215Repository()
        private val repository8 = Feature238Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 265"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
                repository7.getData()
                repository8.getData()
            }
        }
    }
}
