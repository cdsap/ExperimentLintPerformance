package com.performance.module_4_297

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_254.Feature254Repository

class Feature297ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature264Repository()
        private val repository1 = Feature265Repository()
        private val repository2 = Feature245Repository()
        private val repository3 = Feature262Repository()
        private val repository4 = Feature247Repository()
        private val repository5 = Feature243Repository()
        private val repository6 = Feature274Repository()
        private val repository7 = Feature271Repository()
        private val repository8 = Feature263Repository()
        private val repository9 = Feature273Repository()
        private val repository10 = Feature254Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 297"
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
            }
        }
    }
}
