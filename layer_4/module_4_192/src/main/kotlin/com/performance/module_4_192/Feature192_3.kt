package com.performance.module_4_192

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_192.R
import kotlinx.coroutines.launch
import com.performance.module_3_170.Feature170Repository
import com.performance.module_3_174.Feature174Repository
import com.performance.module_3_169.Feature169Repository
import com.performance.module_3_167.Feature167Repository
import com.performance.module_3_181.Feature181Repository
import com.performance.module_3_179.Feature179Repository
import com.performance.module_3_176.Feature176Repository
import com.performance.module_3_180.Feature180Repository
import com.performance.module_3_165.Feature165Repository

class Feature192Fragment : Fragment() {
    private lateinit var viewModel: Feature192ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_192, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature192ViewModel::class.java]
        
        val repository0 = Feature170Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature174Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature169Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature167Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature181Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature179Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature176Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature180Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature165Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
