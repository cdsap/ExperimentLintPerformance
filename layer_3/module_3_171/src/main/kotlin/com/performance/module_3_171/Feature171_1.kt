package com.performance.module_3_171

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_142.Feature142Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_161.Feature161Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_151.Feature151Repository
import com.performance.module_2_148.Feature148Repository

class Feature171ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature142Repository()
        private val repository1 = Feature152Repository()
        private val repository2 = Feature161Repository()
        private val repository3 = Feature153Repository()
        private val repository4 = Feature137Repository()
        private val repository5 = Feature151Repository()
        private val repository6 = Feature148Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 171"
                repository0.getData()
                repository1.getData()
                repository2.getData()
                repository3.getData()
                repository4.getData()
                repository5.getData()
                repository6.getData()
            }
        }
    }
}
