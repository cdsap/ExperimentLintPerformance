package com.performance.module_4_280

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_280.R
import kotlinx.coroutines.launch
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_264.Feature264Repository
import com.performance.module_3_263.Feature263Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_270.Feature270Repository

class Feature280Fragment : Fragment() {
    private lateinit var viewModel: Feature280ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_280, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature280ViewModel::class.java]
        
        val repository0 = Feature272Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature262Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature264Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature263Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature244Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature267Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature246Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature270Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
