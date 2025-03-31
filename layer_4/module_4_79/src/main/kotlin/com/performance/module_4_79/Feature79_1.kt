package com.performance.module_4_79

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_73.Feature73Repository
import com.performance.module_3_66.Feature66Repository
import com.performance.module_3_51.Feature51Repository
import com.performance.module_3_57.Feature57Repository
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_71.Feature71Repository
import com.performance.module_3_59.Feature59Repository
import com.performance.module_3_50.Feature50Repository
import com.performance.module_3_55.Feature55Repository

class Feature79ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature73Repository()
        private val repository1 = Feature66Repository()
        private val repository2 = Feature51Repository()
        private val repository3 = Feature57Repository()
        private val repository4 = Feature64Repository()
        private val repository5 = Feature63Repository()
        private val repository6 = Feature71Repository()
        private val repository7 = Feature59Repository()
        private val repository8 = Feature50Repository()
        private val repository9 = Feature55Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 79"
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
            }
        }
    }
}
