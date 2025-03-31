package com.performance.module_2_227

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_227.R
import kotlinx.coroutines.launch
import com.performance.module_1_154.Feature154Repository
import com.performance.module_1_153.Feature153Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_172.Feature172Repository
import com.performance.module_1_137.Feature137Repository
import com.performance.module_1_170.Feature170Repository

class Feature227Fragment : Fragment() {
    private lateinit var viewModel: Feature227ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_227, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature227ViewModel::class.java]
        
        val repository0 = Feature154Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature153Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature158Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature172Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature137Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature170Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
