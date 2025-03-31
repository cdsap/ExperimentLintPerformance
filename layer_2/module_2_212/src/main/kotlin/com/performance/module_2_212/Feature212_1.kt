package com.performance.module_2_212

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_176.Feature176Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_195.Feature195Repository
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_167.Feature167Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_165.Feature165Repository

class Feature212ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature158Repository()
        private val repository1 = Feature176Repository()
        private val repository2 = Feature139Repository()
        private val repository3 = Feature136Repository()
        private val repository4 = Feature154Repository()
        private val repository5 = Feature155Repository()
        private val repository6 = Feature148Repository()
        private val repository7 = Feature152Repository()
        private val repository8 = Feature193Repository()
        private val repository9 = Feature195Repository()
        private val repository10 = Feature168Repository()
        private val repository11 = Feature167Repository()
        private val repository12 = Feature150Repository()
        private val repository13 = Feature165Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 212"
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
