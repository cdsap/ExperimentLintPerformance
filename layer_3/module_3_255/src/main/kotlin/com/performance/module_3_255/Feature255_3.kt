package com.performance.module_3_255

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_255.R
import kotlinx.coroutines.launch
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_221.Feature221Repository
import com.performance.module_2_200.Feature200Repository
import com.performance.module_2_234.Feature234Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_235.Feature235Repository
import com.performance.module_2_227.Feature227Repository
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_209.Feature209Repository
import com.performance.module_2_236.Feature236Repository

class Feature255Fragment : Fragment() {
    private lateinit var viewModel: Feature255ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_255, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature255ViewModel::class.java]
        
        val repository0 = Feature203Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature199Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature221Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature200Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature234Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature228Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature219Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature235Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature227Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature211Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature209Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature236Repository()
        lifecycleScope.launch {
            repository11.getData()
        }

    }
}
