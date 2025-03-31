package com.performance.module_2_138

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_100.Feature100Repository
import com.performance.module_1_91.Feature91Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_128.Feature128Repository
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_89.Feature89Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_126.Feature126Repository

class Feature138ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature100Repository()
        private val repository1 = Feature91Repository()
        private val repository2 = Feature132Repository()
        private val repository3 = Feature128Repository()
        private val repository4 = Feature90Repository()
        private val repository5 = Feature89Repository()
        private val repository6 = Feature93Repository()
        private val repository7 = Feature95Repository()
        private val repository8 = Feature126Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 138"
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
