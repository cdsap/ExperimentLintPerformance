package com.performance.module_1_124

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_124.R
import kotlinx.coroutines.launch
import com.performance.module_0_47.Feature47Repository
import com.performance.module_0_45.Feature45Repository
import com.performance.module_0_36.Feature36Repository
import com.performance.module_0_31.Feature31Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_86.Feature86Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_29.Feature29Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_75.Feature75Repository

class Feature124Fragment : Fragment() {
    private lateinit var viewModel: Feature124ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_124, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature124ViewModel::class.java]
        
        val repository0 = Feature47Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature45Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature36Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature31Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature56Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature86Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature14Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature29Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature3Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature75Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
