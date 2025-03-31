package com.performance.module_2_199

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_199.R
import kotlinx.coroutines.launch
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_193.Feature193Repository
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_182.Feature182Repository

class Feature199Fragment : Fragment() {
    private lateinit var viewModel: Feature199ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_199, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature199ViewModel::class.java]
        
        val repository0 = Feature178Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature138Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature193Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature163Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature182Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
