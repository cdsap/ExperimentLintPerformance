package com.performance.module_1_23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_23.R
import kotlinx.coroutines.launch
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_3.Feature3Repository
import com.performance.module_0_5.Feature5Repository

class Feature23Fragment : Fragment() {
    private lateinit var viewModel: Feature23ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_23, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature23ViewModel::class.java]
        
        val repository0 = Feature13Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature3Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature5Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
