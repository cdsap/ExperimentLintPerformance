package com.performance.module_2_201

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_201.R
import kotlinx.coroutines.launch
import com.performance.module_1_162.Feature162Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_148.Feature148Repository
import com.performance.module_1_177.Feature177Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_172.Feature172Repository

class Feature201Fragment : Fragment() {
    private lateinit var viewModel: Feature201ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_201, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature201ViewModel::class.java]
        
        val repository0 = Feature162Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature142Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature170Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature148Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature177Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature153Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature144Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature158Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature174Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature150Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature172Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
