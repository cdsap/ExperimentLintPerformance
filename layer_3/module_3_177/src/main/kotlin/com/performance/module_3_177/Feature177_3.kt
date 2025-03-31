package com.performance.module_3_177

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_177.R
import kotlinx.coroutines.launch
import com.performance.module_2_158.Feature158Repository
import com.performance.module_2_147.Feature147Repository

class Feature177Fragment : Fragment() {
    private lateinit var viewModel: Feature177ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_177, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature177ViewModel::class.java]
        
        val repository0 = Feature158Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature147Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
