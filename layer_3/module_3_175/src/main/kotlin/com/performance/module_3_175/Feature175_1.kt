package com.performance.module_3_175

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_140.Feature140Repository
import com.performance.module_2_154.Feature154Repository
import com.performance.module_2_146.Feature146Repository
import com.performance.module_2_157.Feature157Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_136.Feature136Repository
import com.performance.module_2_155.Feature155Repository

class Feature175ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature138Repository()
        private val repository1 = Feature144Repository()
        private val repository2 = Feature134Repository()
        private val repository3 = Feature150Repository()
        private val repository4 = Feature153Repository()
        private val repository5 = Feature135Repository()
        private val repository6 = Feature140Repository()
        private val repository7 = Feature154Repository()
        private val repository8 = Feature146Repository()
        private val repository9 = Feature157Repository()
        private val repository10 = Feature152Repository()
        private val repository11 = Feature149Repository()
        private val repository12 = Feature136Repository()
        private val repository13 = Feature155Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 175"
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
                repository13.getData()
            }
        }
    }
}
