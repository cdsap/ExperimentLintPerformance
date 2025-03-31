package com.performance.module_4_84

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_84.R
import kotlinx.coroutines.launch
import com.performance.module_3_71.Feature71Repository

class Feature84Fragment : Fragment() {
    private lateinit var viewModel: Feature84ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_84, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature84ViewModel::class.java]
        
        val repository0 = Feature71Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
