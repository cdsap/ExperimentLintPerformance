package com.performance.module_1_35

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_35.R
import kotlinx.coroutines.launch
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_2.Feature2Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_14.Feature14Repository

class Feature35Fragment : Fragment() {
    private lateinit var viewModel: Feature35ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_35, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature35ViewModel::class.java]
        
        val repository0 = Feature12Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature8Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature10Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature2Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature13Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature14Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
