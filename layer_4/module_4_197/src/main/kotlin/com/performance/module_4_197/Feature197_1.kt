package com.performance.module_4_197

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.performance.module_3_167.Feature167Repository
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_183.Feature183Repository
import com.performance.module_3_180.Feature180Repository
import com.performance.module_3_171.Feature171Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_169.Feature169Repository
import com.performance.module_3_170.Feature170Repository

class Feature197ViewModel : ViewModel() {
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    
        private val repository0 = Feature167Repository()
        private val repository1 = Feature166Repository()
        private val repository2 = Feature183Repository()
        private val repository3 = Feature180Repository()
        private val repository4 = Feature171Repository()
        private val repository5 = Feature181Repository()
        private val repository6 = Feature169Repository()
        private val repository7 = Feature170Repository()


    fun onResume() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                _data.value = "Data from Feature 197"
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
