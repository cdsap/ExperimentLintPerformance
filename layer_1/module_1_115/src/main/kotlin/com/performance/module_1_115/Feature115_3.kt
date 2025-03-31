package com.performance.module_1_115

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_115.R
import kotlinx.coroutines.launch
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_22.Feature22Repository
import com.performance.module_0_71.Feature71Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_30.Feature30Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_2.Feature2Repository

class Feature115Fragment : Fragment() {
    private lateinit var viewModel: Feature115ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_115, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature115ViewModel::class.java]
        
        val repository0 = Feature81Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature22Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature71Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature64Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature30Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature10Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature35Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature4Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature33Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature2Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
