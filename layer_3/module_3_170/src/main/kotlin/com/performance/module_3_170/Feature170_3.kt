package com.performance.module_3_170

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_170.R
import kotlinx.coroutines.launch
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_156.Feature156Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_153.Feature153Repository
import com.performance.module_2_148.Feature148Repository
import com.performance.module_2_136.Feature136Repository
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_155.Feature155Repository

class Feature170Fragment : Fragment() {
    private lateinit var viewModel: Feature170ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_170, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature170ViewModel::class.java]
        
        val repository0 = Feature145Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature156Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature133Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature153Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature148Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature136Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature158Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature155Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
