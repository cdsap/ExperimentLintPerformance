package com.performance.module_3_272

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_272.R
import kotlinx.coroutines.launch
import com.performance.module_2_226.Feature226Repository
import com.performance.module_2_230.Feature230Repository
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_224.Feature224Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_222.Feature222Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_201.Feature201Repository

class Feature272Fragment : Fragment() {
    private lateinit var viewModel: Feature272ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_272, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature272ViewModel::class.java]
        
        val repository0 = Feature226Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature230Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature206Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature224Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature228Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature222Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature212Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature232Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature201Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
