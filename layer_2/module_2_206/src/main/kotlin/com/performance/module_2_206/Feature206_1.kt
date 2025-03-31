package com.performance.module_2_206

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_151.Feature151Repository
import com.performance.module_1_194.Feature194Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_186.Feature186Repository
import com.performance.module_1_176.Feature176Repository
import com.performance.module_1_167.Feature167Repository
import com.performance.module_1_177.Feature177Repository
import com.performance.module_1_173.Feature173Repository
import com.performance.module_1_180.Feature180Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_134.Feature134Repository
import com.performance.module_1_133.Feature133Repository
import com.performance.module_1_140.Feature140Repository

class Feature206ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature151Repository()
        private val repository1 = Feature194Repository()
        private val repository2 = Feature158Repository()
        private val repository3 = Feature186Repository()
        private val repository4 = Feature176Repository()
        private val repository5 = Feature167Repository()
        private val repository6 = Feature177Repository()
        private val repository7 = Feature173Repository()
        private val repository8 = Feature180Repository()
        private val repository9 = Feature188Repository()
        private val repository10 = Feature134Repository()
        private val repository11 = Feature133Repository()
        private val repository12 = Feature140Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 206"
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
