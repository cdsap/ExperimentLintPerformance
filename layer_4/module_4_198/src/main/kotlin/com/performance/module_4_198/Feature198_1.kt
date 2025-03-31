package com.performance.module_4_198

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_169.Feature169Repository
import com.performance.module_3_183.Feature183Repository
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_165.Feature165Repository
import com.performance.module_3_167.Feature167Repository
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_173.Feature173Repository

class Feature198ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature169Repository()
        private val repository1 = Feature183Repository()
        private val repository2 = Feature170Repository()
        private val repository3 = Feature165Repository()
        private val repository4 = Feature167Repository()
        private val repository5 = Feature175Repository()
        private val repository6 = Feature181Repository()
        private val repository7 = Feature182Repository()
        private val repository8 = Feature166Repository()
        private val repository9 = Feature173Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 198"
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
            }
        }
    }
}
