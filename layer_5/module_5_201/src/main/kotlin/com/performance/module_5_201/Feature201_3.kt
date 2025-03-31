package com.performance.module_5_201

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_5_201.R
import kotlinx.coroutines.launch
import com.performance.module_4_188.Feature188Repository
import com.performance.module_4_190.Feature190Repository
import com.performance.module_4_194.Feature194Repository
import com.performance.module_4_193.Feature193Repository
import com.performance.module_4_192.Feature192Repository
import com.performance.module_4_186.Feature186Repository
import com.performance.module_4_185.Feature185Repository
import com.performance.module_4_195.Feature195Repository

class Feature201Fragment : Fragment() {
    private lateinit var viewModel: Feature201ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_201, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature201ViewModel::class.java]
        
        val repository0 = Feature188Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature190Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature194Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature193Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature192Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature186Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature185Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature195Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
