package com.performance.module_1_105

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_105.R
import kotlinx.coroutines.launch
import com.performance.module_0_75.Feature75Repository
import com.performance.module_0_26.Feature26Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_45.Feature45Repository
import com.performance.module_0_80.Feature80Repository
import com.performance.module_0_18.Feature18Repository
import com.performance.module_0_17.Feature17Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_33.Feature33Repository
import com.performance.module_0_39.Feature39Repository
import com.performance.module_0_40.Feature40Repository

class Feature105Fragment : Fragment() {
    private lateinit var viewModel: Feature105ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_105, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature105ViewModel::class.java]
        
        val repository0 = Feature75Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature26Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature10Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature13Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature45Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature80Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature18Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature17Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature11Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature33Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature39Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature40Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
