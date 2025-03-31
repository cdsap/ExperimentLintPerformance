package com.performance.module_2_156

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_156.R
import kotlinx.coroutines.launch
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_116.Feature116Repository

class Feature156Fragment : Fragment() {
    private lateinit var viewModel: Feature156ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_156, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature156ViewModel::class.java]
        
        val repository0 = Feature90Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature116Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
