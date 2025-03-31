package com.performance.module_1_30

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_30.R
import kotlinx.coroutines.launch
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_14.Feature14Repository

class Feature30Fragment : Fragment() {
    private lateinit var viewModel: Feature30ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_30, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature30ViewModel::class.java]
        
        val repository0 = Feature10Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature1Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature12Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature9Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature13Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature3Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature14Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
