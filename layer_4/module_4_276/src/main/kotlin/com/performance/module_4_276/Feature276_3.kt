package com.performance.module_4_276

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_276.R
import kotlinx.coroutines.launch
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_269.Feature269Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_256.Feature256Repository
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_245.Feature245Repository
import com.performance.module_3_273.Feature273Repository

class Feature276Fragment : Fragment() {
    private lateinit var viewModel: Feature276ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_276, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature276ViewModel::class.java]
        
        val repository0 = Feature270Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature260Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature263Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature254Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature250Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature257Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature269Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature258Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature256Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature272Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature261Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature245Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature273Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
