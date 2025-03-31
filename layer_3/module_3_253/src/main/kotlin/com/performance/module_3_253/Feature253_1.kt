package com.performance.module_3_253

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_200.Feature200Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_238.Feature238Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_234.Feature234Repository
import com.performance.module_2_235.Feature235Repository
import com.performance.module_2_223.Feature223Repository

class Feature253ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature219Repository()
        private val repository1 = Feature200Repository()
        private val repository2 = Feature216Repository()
        private val repository3 = Feature202Repository()
        private val repository4 = Feature240Repository()
        private val repository5 = Feature201Repository()
        private val repository6 = Feature222Repository()
        private val repository7 = Feature238Repository()
        private val repository8 = Feature212Repository()
        private val repository9 = Feature199Repository()
        private val repository10 = Feature234Repository()
        private val repository11 = Feature235Repository()
        private val repository12 = Feature223Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 253"
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
