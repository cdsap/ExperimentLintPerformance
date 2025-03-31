package com.performance.module_3_247

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_247.R
import kotlinx.coroutines.launch
import com.performance.module_2_220.Feature220Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_236.Feature236Repository
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_203.Feature203Repository

class Feature247Fragment : Fragment() {
    private lateinit var viewModel: Feature247ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_247, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature247ViewModel::class.java]
        
        val repository0 = Feature220Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature199Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature236Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature204Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature213Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature216Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature203Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
