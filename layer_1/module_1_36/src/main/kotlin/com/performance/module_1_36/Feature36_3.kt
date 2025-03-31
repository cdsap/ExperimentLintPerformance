package com.performance.module_1_36

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_36.R
import kotlinx.coroutines.launch
import com.performance.module_0_12.Feature12Repository
import com.performance.module_0_15.Feature15Repository

class Feature36Fragment : Fragment() {
    private lateinit var viewModel: Feature36ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_36, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature36ViewModel::class.java]
        
        val repository0 = Feature12Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature15Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
