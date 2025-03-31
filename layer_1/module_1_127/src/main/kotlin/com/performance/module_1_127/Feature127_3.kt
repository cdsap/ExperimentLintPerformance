package com.performance.module_1_127

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_127.R
import kotlinx.coroutines.launch
import com.performance.module_0_52.Feature52Repository
import com.performance.module_0_64.Feature64Repository
import com.performance.module_0_86.Feature86Repository
import com.performance.module_0_49.Feature49Repository
import com.performance.module_0_44.Feature44Repository
import com.performance.module_0_56.Feature56Repository
import com.performance.module_0_67.Feature67Repository
import com.performance.module_0_72.Feature72Repository
import com.performance.module_0_85.Feature85Repository
import com.performance.module_0_31.Feature31Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_29.Feature29Repository
import com.performance.module_0_5.Feature5Repository

class Feature127Fragment : Fragment() {
    private lateinit var viewModel: Feature127ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_127, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature127ViewModel::class.java]
        
        val repository0 = Feature52Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature64Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature86Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature49Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature44Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature56Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature67Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature72Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature85Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature31Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature61Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature29Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature5Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
