package com.performance.module_3_176

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_176.R
import kotlinx.coroutines.launch
import com.performance.module_2_136.Feature136Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_133.Feature133Repository
import com.performance.module_2_146.Feature146Repository
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_137.Feature137Repository
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_141.Feature141Repository
import com.performance.module_2_147.Feature147Repository

class Feature176Fragment : Fragment() {
    private lateinit var viewModel: Feature176ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_176, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature176ViewModel::class.java]
        
        val repository0 = Feature136Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature144Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature133Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature146Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature155Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature137Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature145Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature141Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature147Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
