package com.performance.module_3_254

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_254.R
import kotlinx.coroutines.launch
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_214.Feature214Repository
import com.performance.module_2_220.Feature220Repository
import com.performance.module_2_223.Feature223Repository
import com.performance.module_2_237.Feature237Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_206.Feature206Repository

class Feature254Fragment : Fragment() {
    private lateinit var viewModel: Feature254ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_254, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature254ViewModel::class.java]
        
        val repository0 = Feature211Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature214Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature220Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature223Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature237Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature203Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature206Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
