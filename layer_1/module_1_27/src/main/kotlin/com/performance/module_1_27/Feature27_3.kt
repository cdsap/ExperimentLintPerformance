package com.performance.module_1_27

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_27.R
import kotlinx.coroutines.launch
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_14.Feature14Repository

class Feature27Fragment : Fragment() {
    private lateinit var viewModel: Feature27ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_27, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature27ViewModel::class.java]
        
        val repository0 = Feature1Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature9Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature2Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature11Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature12Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature14Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
