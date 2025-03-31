package com.performance.module_1_24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_24.R
import kotlinx.coroutines.launch
import com.performance.module_0_4.Feature4Repository

class Feature24Fragment : Fragment() {
    private lateinit var viewModel: Feature24ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_24, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature24ViewModel::class.java]
        
        val repository0 = Feature4Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
