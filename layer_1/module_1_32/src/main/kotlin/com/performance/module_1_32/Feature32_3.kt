package com.performance.module_1_32

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_32.R
import kotlinx.coroutines.launch
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_9.Feature9Repository
import com.performance.module_0_8.Feature8Repository

class Feature32Fragment : Fragment() {
    private lateinit var viewModel: Feature32ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_32, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature32ViewModel::class.java]
        
        val repository0 = Feature1Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature4Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature9Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature8Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
