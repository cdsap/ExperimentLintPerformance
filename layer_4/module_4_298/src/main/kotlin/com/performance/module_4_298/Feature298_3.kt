package com.performance.module_4_298

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_298.R
import kotlinx.coroutines.launch
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_256.Feature256Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_252.Feature252Repository

class Feature298Fragment : Fragment() {
    private lateinit var viewModel: Feature298ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_298, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature298ViewModel::class.java]
        
        val repository0 = Feature274Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature251Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature248Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature266Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature268Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature254Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature244Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature246Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature273Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature255Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature256Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature262Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature272Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature267Repository()
        lifecycleScope.launch {
            repository13.getData()
        }
        val repository14 = Feature252Repository()
        lifecycleScope.launch {
            repository14.getData()
        }

    }
}
