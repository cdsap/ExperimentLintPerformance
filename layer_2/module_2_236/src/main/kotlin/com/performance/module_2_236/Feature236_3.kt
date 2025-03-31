package com.performance.module_2_236

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_236.R
import kotlinx.coroutines.launch
import com.performance.module_1_181.Feature181Repository
import com.performance.module_1_161.Feature161Repository
import com.performance.module_1_160.Feature160Repository

class Feature236Fragment : Fragment() {
    private lateinit var viewModel: Feature236ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_236, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature236ViewModel::class.java]
        
        val repository0 = Feature181Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature161Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature160Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
