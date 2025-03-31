package com.performance.module_1_22

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_22.R
import kotlinx.coroutines.launch
import com.performance.module_0_10.Feature10Repository

class Feature22Fragment : Fragment() {
    private lateinit var viewModel: Feature22ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_22, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature22ViewModel::class.java]
        
        val repository0 = Feature10Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
