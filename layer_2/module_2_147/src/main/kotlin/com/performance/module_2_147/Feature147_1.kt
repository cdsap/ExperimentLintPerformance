package com.performance.module_2_147

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_131.Feature131Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_113.Feature113Repository
import com.performance.module_1_89.Feature89Repository
import com.performance.module_1_108.Feature108Repository

class Feature147ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature90Repository()
        private val repository1 = Feature116Repository()
        private val repository2 = Feature131Repository()
        private val repository3 = Feature93Repository()
        private val repository4 = Feature124Repository()
        private val repository5 = Feature113Repository()
        private val repository6 = Feature89Repository()
        private val repository7 = Feature108Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 147"
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
