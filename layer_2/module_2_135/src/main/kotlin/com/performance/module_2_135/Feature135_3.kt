package com.performance.module_2_135

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_135.R
import kotlinx.coroutines.launch
import com.performance.module_1_90.Feature90Repository

class Feature135Fragment : Fragment() {
    private lateinit var viewModel: Feature135ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_135, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature135ViewModel::class.java]
        
        val repository0 = Feature90Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
