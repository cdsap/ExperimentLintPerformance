package com.performance.module_4_288

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_288.R
import kotlinx.coroutines.launch
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_248.Feature248Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_272.Feature272Repository

class Feature288Fragment : Fragment() {
    private lateinit var viewModel: Feature288ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_288, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature288ViewModel::class.java]
        
        val repository0 = Feature262Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature259Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature248Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature271Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature244Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature258Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature260Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature274Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature272Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
