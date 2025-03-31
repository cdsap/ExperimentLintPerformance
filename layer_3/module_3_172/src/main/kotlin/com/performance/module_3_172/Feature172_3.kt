package com.performance.module_3_172

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_172.R
import kotlinx.coroutines.launch
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_136.Feature136Repository
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_162.Feature162Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_139.Feature139Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_138.Feature138Repository

class Feature172Fragment : Fragment() {
    private lateinit var viewModel: Feature172ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_172, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature172ViewModel::class.java]
        
        val repository0 = Feature158Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature152Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature145Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature136Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature147Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature160Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature162Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature150Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature139Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature149Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature138Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
