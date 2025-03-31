package com.performance.module_2_208

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_208.R
import kotlinx.coroutines.launch
import com.performance.module_1_168.Feature168Repository
import com.performance.module_1_182.Feature182Repository
import com.performance.module_1_198.Feature198Repository
import com.performance.module_1_192.Feature192Repository
import com.performance.module_1_150.Feature150Repository
import com.performance.module_1_160.Feature160Repository
import com.performance.module_1_170.Feature170Repository
import com.performance.module_1_172.Feature172Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_161.Feature161Repository

class Feature208Fragment : Fragment() {
    private lateinit var viewModel: Feature208ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_208, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature208ViewModel::class.java]
        
        val repository0 = Feature168Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature182Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature198Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature192Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature150Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature160Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature170Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature172Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature136Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature161Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
