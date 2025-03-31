package com.performance.module_5_301

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_4_300.Feature300Repository
import com.performance.module_4_281.Feature281Repository
import com.performance.module_4_297.Feature297Repository
import com.performance.module_4_282.Feature282Repository
import com.performance.module_4_284.Feature284Repository
import com.performance.module_4_276.Feature276Repository
import com.performance.module_4_280.Feature280Repository
import com.performance.module_4_283.Feature283Repository
import com.performance.module_4_294.Feature294Repository
import com.performance.module_4_293.Feature293Repository
import com.performance.module_4_277.Feature277Repository
import com.performance.module_4_288.Feature288Repository
import com.performance.module_4_290.Feature290Repository

class Feature301ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature300Repository()
        private val repository1 = Feature281Repository()
        private val repository2 = Feature297Repository()
        private val repository3 = Feature282Repository()
        private val repository4 = Feature284Repository()
        private val repository5 = Feature276Repository()
        private val repository6 = Feature280Repository()
        private val repository7 = Feature283Repository()
        private val repository8 = Feature294Repository()
        private val repository9 = Feature293Repository()
        private val repository10 = Feature277Repository()
        private val repository11 = Feature288Repository()
        private val repository12 = Feature290Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 301"
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
