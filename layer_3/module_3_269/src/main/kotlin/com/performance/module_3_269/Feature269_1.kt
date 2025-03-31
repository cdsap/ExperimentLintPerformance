package com.performance.module_3_269

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_205.Feature205Repository
import com.performance.module_2_234.Feature234Repository
import com.performance.module_2_208.Feature208Repository
import com.performance.module_2_226.Feature226Repository
import com.performance.module_2_237.Feature237Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_219.Feature219Repository

class Feature269ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature225Repository()
        private val repository1 = Feature203Repository()
        private val repository2 = Feature205Repository()
        private val repository3 = Feature234Repository()
        private val repository4 = Feature208Repository()
        private val repository5 = Feature226Repository()
        private val repository6 = Feature237Repository()
        private val repository7 = Feature202Repository()
        private val repository8 = Feature219Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 269"
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
