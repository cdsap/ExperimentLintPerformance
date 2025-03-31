package com.performance.module_1_144

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_144.R
import kotlinx.coroutines.launch
import com.performance.module_0_127.Feature127Repository
import com.performance.module_0_116.Feature116Repository
import com.performance.module_0_61.Feature61Repository

class Feature144Fragment : Fragment() {
    private lateinit var viewModel: Feature144ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_144, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature144ViewModel::class.java]
        
        val repository0 = Feature127Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature116Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature61Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
