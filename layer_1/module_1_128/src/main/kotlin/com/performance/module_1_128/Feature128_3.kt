package com.performance.module_1_128

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_128.R
import kotlinx.coroutines.launch
import com.performance.module_0_70.Feature70Repository
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_9.Feature9Repository

class Feature128Fragment : Fragment() {
    private lateinit var viewModel: Feature128ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_128, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature128ViewModel::class.java]
        
        val repository0 = Feature70Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature81Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature9Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
