package com.performance.module_3_182

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_182.R
import kotlinx.coroutines.launch
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_139.Feature139Repository
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_141.Feature141Repository

class Feature182Fragment : Fragment() {
    private lateinit var viewModel: Feature182ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_182, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature182ViewModel::class.java]
        
        val repository0 = Feature149Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature155Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature137Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature139Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature138Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature141Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
