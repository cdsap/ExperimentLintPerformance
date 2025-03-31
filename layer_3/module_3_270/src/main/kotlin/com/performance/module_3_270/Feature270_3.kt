package com.performance.module_3_270

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_270.R
import kotlinx.coroutines.launch
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_235.Feature235Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_199.Feature199Repository

class Feature270Fragment : Fragment() {
    private lateinit var viewModel: Feature270ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_270, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature270ViewModel::class.java]
        
        val repository0 = Feature211Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature235Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature230Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature225Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature217Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature199Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
