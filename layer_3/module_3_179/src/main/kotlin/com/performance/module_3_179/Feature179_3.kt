package com.performance.module_3_179

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_179.R
import kotlinx.coroutines.launch
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_139.Feature139Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_162.Feature162Repository
import com.performance.module_2_141.Feature141Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_142.Feature142Repository
import com.performance.module_2_152.Feature152Repository

class Feature179Fragment : Fragment() {
    private lateinit var viewModel: Feature179ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_179, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature179ViewModel::class.java]
        
        val repository0 = Feature160Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature133Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature139Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature156Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature162Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature141Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature135Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature155Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature142Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature152Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
