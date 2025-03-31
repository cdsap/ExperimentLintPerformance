package com.performance.module_4_285

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_285.R
import kotlinx.coroutines.launch
import com.performance.module_3_271.Feature271Repository

class Feature285Fragment : Fragment() {
    private lateinit var viewModel: Feature285ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_285, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature285ViewModel::class.java]
        
        val repository0 = Feature271Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
