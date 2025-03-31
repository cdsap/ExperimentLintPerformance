package com.performance.module_4_200

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_200.R
import kotlinx.coroutines.launch
import com.performance.module_3_175.Feature175Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_173.Feature173Repository
import com.performance.module_3_183.Feature183Repository
import com.performance.module_3_167.Feature167Repository
import com.performance.module_3_163.Feature163Repository
import com.performance.module_3_164.Feature164Repository
import com.performance.module_3_177.Feature177Repository
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_170.Feature170Repository

class Feature200Fragment : Fragment() {
    private lateinit var viewModel: Feature200ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_200, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature200ViewModel::class.java]
        
        val repository0 = Feature175Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature179Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature173Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature183Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature167Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature163Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature164Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature177Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature182Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature170Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
