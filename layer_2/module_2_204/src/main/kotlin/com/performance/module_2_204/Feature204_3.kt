package com.performance.module_2_204

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_204.R
import kotlinx.coroutines.launch
import com.performance.module_1_195.Feature195Repository
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_178.Feature178Repository
import com.performance.module_1_145.Feature145Repository
import com.performance.module_1_155.Feature155Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_173.Feature173Repository

class Feature204Fragment : Fragment() {
    private lateinit var viewModel: Feature204ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_204, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature204ViewModel::class.java]
        
        val repository0 = Feature195Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature170Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature183Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature178Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature145Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature155Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature152Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature163Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature189Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature173Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
