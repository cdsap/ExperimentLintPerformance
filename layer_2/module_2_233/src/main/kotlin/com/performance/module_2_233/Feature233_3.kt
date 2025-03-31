package com.performance.module_2_233

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_233.R
import kotlinx.coroutines.launch
import com.performance.module_1_161.Feature161Repository
import com.performance.module_1_158.Feature158Repository
import com.performance.module_1_172.Feature172Repository

class Feature233Fragment : Fragment() {
    private lateinit var viewModel: Feature233ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_233, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature233ViewModel::class.java]
        
        val repository0 = Feature161Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature158Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature172Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
