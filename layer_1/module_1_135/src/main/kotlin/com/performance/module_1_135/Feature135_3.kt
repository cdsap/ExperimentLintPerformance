package com.performance.module_1_135

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_135.R
import kotlinx.coroutines.launch
import com.performance.module_0_85.Feature85Repository
import com.performance.module_0_120.Feature120Repository
import com.performance.module_0_83.Feature83Repository
import com.performance.module_0_92.Feature92Repository
import com.performance.module_0_27.Feature27Repository
import com.performance.module_0_73.Feature73Repository
import com.performance.module_0_79.Feature79Repository
import com.performance.module_0_108.Feature108Repository

class Feature135Fragment : Fragment() {
    private lateinit var viewModel: Feature135ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_135, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature135ViewModel::class.java]
        
        val repository0 = Feature85Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature120Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature83Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature92Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature27Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature73Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature79Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature108Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
