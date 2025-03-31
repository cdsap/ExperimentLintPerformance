package com.performance.module_3_271

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_271.R
import kotlinx.coroutines.launch
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_230.Feature230Repository

class Feature271Fragment : Fragment() {
    private lateinit var viewModel: Feature271ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_271, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature271ViewModel::class.java]
        
        val repository0 = Feature206Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature199Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature230Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
