package com.performance.module_4_295

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_295.R
import kotlinx.coroutines.launch
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_273.Feature273Repository
import com.performance.module_3_249.Feature249Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_252.Feature252Repository
import com.performance.module_3_243.Feature243Repository

class Feature295Fragment : Fragment() {
    private lateinit var viewModel: Feature295ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_295, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature295ViewModel::class.java]
        
        val repository0 = Feature266Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature262Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature272Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature270Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature273Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature249Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature264Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature251Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature252Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature243Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
