package com.performance.module_3_163

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_162.Feature162Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_141.Feature141Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_151.Feature151Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_150.Feature150Repository

class Feature163ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature162Repository()
        private val repository1 = Feature152Repository()
        private val repository2 = Feature141Repository()
        private val repository3 = Feature147Repository()
        private val repository4 = Feature148Repository()
        private val repository5 = Feature149Repository()
        private val repository6 = Feature153Repository()
        private val repository7 = Feature135Repository()
        private val repository8 = Feature158Repository()
        private val repository9 = Feature151Repository()
        private val repository10 = Feature137Repository()
        private val repository11 = Feature150Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 163"
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
            }
        }
    }
}
