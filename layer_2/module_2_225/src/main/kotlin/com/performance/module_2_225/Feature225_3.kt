package com.performance.module_2_225

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_225.R
import kotlinx.coroutines.launch
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_159.Feature159Repository

class Feature225Fragment : Fragment() {
    private lateinit var viewModel: Feature225ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_225, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature225ViewModel::class.java]
        
        val repository0 = Feature144Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature182Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature174Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature192Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature147Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature159Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
