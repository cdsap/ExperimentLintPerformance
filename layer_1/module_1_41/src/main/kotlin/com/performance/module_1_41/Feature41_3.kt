package com.performance.module_1_41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_41.R
import kotlinx.coroutines.launch
import com.performance.module_0_8.Feature8Repository
import com.performance.module_0_10.Feature10Repository

class Feature41Fragment : Fragment() {
    private lateinit var viewModel: Feature41ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_41, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature41ViewModel::class.java]
        
        val repository0 = Feature8Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature10Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
