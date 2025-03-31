package com.performance.module_1_17

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_17.R
import kotlinx.coroutines.launch
import com.performance.module_0_15.Feature15Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_6.Feature6Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_12.Feature12Repository

class Feature17Fragment : Fragment() {
    private lateinit var viewModel: Feature17ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_17, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature17ViewModel::class.java]
        
        val repository0 = Feature15Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature7Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature6Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature4Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature8Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature12Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
