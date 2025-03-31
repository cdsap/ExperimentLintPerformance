package com.performance.module_4_191

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_191.R
import kotlinx.coroutines.launch
import com.performance.module_3_168.Feature168Repository
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_166.Feature166Repository
import com.performance.module_3_165.Feature165Repository

class Feature191Fragment : Fragment() {
    private lateinit var viewModel: Feature191ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_191, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature191ViewModel::class.java]
        
        val repository0 = Feature168Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature170Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature179Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature182Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature166Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature165Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
