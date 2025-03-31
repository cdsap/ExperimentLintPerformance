package com.performance.module_2_218

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_218.R
import kotlinx.coroutines.launch
import com.performance.module_1_141.Feature141Repository
import com.performance.module_1_164.Feature164Repository
import com.performance.module_1_147.Feature147Repository
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_190.Feature190Repository
import com.performance.module_1_189.Feature189Repository
import com.performance.module_1_187.Feature187Repository
import com.performance.module_1_160.Feature160Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_143.Feature143Repository
import com.performance.module_1_144.Feature144Repository
import com.performance.module_1_181.Feature181Repository

class Feature218Fragment : Fragment() {
    private lateinit var viewModel: Feature218ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_218, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature218ViewModel::class.java]
        
        val repository0 = Feature141Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature164Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature147Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature168Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature142Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature190Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature189Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature187Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature160Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature182Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature152Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature143Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature144Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature181Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
