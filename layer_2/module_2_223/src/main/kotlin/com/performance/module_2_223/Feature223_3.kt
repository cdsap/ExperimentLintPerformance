package com.performance.module_2_223

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_223.R
import kotlinx.coroutines.launch
import com.performance.module_1_175.Feature175Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_164.Feature164Repository
import com.performance.module_1_188.Feature188Repository
import com.performance.module_1_155.Feature155Repository

class Feature223Fragment : Fragment() {
    private lateinit var viewModel: Feature223ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_223, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature223ViewModel::class.java]
        
        val repository0 = Feature175Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature139Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature164Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature188Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature155Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
