package com.performance.module_3_164

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_164.R
import kotlinx.coroutines.launch
import com.performance.module_2_159.Feature159Repository

class Feature164Fragment : Fragment() {
    private lateinit var viewModel: Feature164ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_164, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature164ViewModel::class.java]
        
        val repository0 = Feature159Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
