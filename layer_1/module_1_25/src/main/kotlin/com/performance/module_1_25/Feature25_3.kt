package com.performance.module_1_25

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_25.R
import kotlinx.coroutines.launch
import com.performance.module_0_1.Feature1Repository
import com.performance.module_0_13.Feature13Repository
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_14.Feature14Repository

class Feature25Fragment : Fragment() {
    private lateinit var viewModel: Feature25ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_25, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature25ViewModel::class.java]
        
        val repository0 = Feature1Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature13Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature7Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature14Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
