package com.performance.module_1_45

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_45.R
import kotlinx.coroutines.launch
import com.performance.module_0_5.Feature5Repository
import com.performance.module_0_6.Feature6Repository

class Feature45Fragment : Fragment() {
    private lateinit var viewModel: Feature45ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_45, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature45ViewModel::class.java]
        
        val repository0 = Feature5Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature6Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
