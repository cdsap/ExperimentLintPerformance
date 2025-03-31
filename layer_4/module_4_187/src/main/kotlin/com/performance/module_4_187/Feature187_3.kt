package com.performance.module_4_187

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_187.R
import kotlinx.coroutines.launch
import com.performance.module_3_174.Feature174Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_168.Feature168Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_173.Feature173Repository
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_176.Feature176Repository
import com.performance.module_3_163.Feature163Repository
import com.performance.module_3_172.Feature172Repository

class Feature187Fragment : Fragment() {
    private lateinit var viewModel: Feature187ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_187, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature187ViewModel::class.java]
        
        val repository0 = Feature174Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature181Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature168Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature179Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature173Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature175Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature176Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature163Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature172Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
