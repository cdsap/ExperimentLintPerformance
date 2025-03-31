package com.performance.module_2_146

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_121.Feature121Repository
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_105.Feature105Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_127.Feature127Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_98.Feature98Repository

class Feature146ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature121Repository()
        private val repository1 = Feature116Repository()
        private val repository2 = Feature105Repository()
        private val repository3 = Feature93Repository()
        private val repository4 = Feature96Repository()
        private val repository5 = Feature127Repository()
        private val repository6 = Feature132Repository()
        private val repository7 = Feature98Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 146"
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
