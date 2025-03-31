package com.performance.module_1_165

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_165.R
import kotlinx.coroutines.launch
import com.performance.module_0_47.Feature47Repository
import com.performance.module_0_66.Feature66Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_61.Feature61Repository
import com.performance.module_0_29.Feature29Repository
import com.performance.module_0_39.Feature39Repository
import com.performance.module_0_6.Feature6Repository
import com.performance.module_0_116.Feature116Repository

class Feature165Fragment : Fragment() {
    private lateinit var viewModel: Feature165ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_165, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature165ViewModel::class.java]
        
        val repository0 = Feature47Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature66Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature11Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature61Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature29Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature39Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature6Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature116Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
