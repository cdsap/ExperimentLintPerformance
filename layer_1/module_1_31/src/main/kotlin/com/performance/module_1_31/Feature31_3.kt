package com.performance.module_1_31

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_31.R
import kotlinx.coroutines.launch
import com.performance.module_0_10.Feature10Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_14.Feature14Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_8.Feature8Repository

class Feature31Fragment : Fragment() {
    private lateinit var viewModel: Feature31ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_31, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature31ViewModel::class.java]
        
        val repository0 = Feature10Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature9Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature14Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature7Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature11Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature8Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
