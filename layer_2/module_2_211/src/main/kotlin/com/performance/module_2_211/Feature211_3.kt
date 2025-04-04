package com.performance.module_2_211

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_211.R
import kotlinx.coroutines.launch
import com.performance.module_1_135.Feature135Repository
import com.performance.module_1_179.Feature179Repository
import com.performance.module_1_146.Feature146Repository
import com.performance.module_1_190.Feature190Repository
import com.performance.module_1_163.Feature163Repository

class Feature211Fragment : Fragment() {
    private lateinit var viewModel: Feature211ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_211, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature211ViewModel::class.java]
        
        val repository0 = Feature135Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature179Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature146Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature190Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature163Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
