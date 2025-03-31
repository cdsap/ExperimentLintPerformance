package com.performance.module_4_184

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_184.R
import kotlinx.coroutines.launch
import com.performance.module_3_178.Feature178Repository
import com.performance.module_3_176.Feature176Repository
import com.performance.module_3_174.Feature174Repository
import com.performance.module_3_164.Feature164Repository
import com.performance.module_3_173.Feature173Repository
import com.performance.module_3_171.Feature171Repository

class Feature184Fragment : Fragment() {
    private lateinit var viewModel: Feature184ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_184, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature184ViewModel::class.java]
        
        val repository0 = Feature178Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature176Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature174Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature164Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature173Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature171Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
