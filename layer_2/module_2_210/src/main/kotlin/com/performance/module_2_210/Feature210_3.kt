package com.performance.module_2_210

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_210.R
import kotlinx.coroutines.launch
import com.performance.module_1_157.Feature157Repository

class Feature210Fragment : Fragment() {
    private lateinit var viewModel: Feature210ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_210, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature210ViewModel::class.java]
        
        val repository0 = Feature157Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
