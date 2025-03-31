package com.performance.module_3_247

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_2_224.Feature224Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_236.Feature236Repository

class Feature247ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature224Repository()
        private val repository1 = Feature213Repository()
        private val repository2 = Feature219Repository()
        private val repository3 = Feature202Repository()
        private val repository4 = Feature201Repository()
        private val repository5 = Feature216Repository()
        private val repository6 = Feature236Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 247"
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
