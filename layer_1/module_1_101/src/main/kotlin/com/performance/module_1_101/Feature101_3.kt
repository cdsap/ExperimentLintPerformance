package com.performance.module_1_101

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_101.R
import kotlinx.coroutines.launch
import com.performance.module_0_31.Feature31Repository
import com.performance.module_0_79.Feature79Repository

class Feature101Fragment : Fragment() {
    private lateinit var viewModel: Feature101ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_101, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature101ViewModel::class.java]
        
        val repository0 = Feature31Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature79Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
