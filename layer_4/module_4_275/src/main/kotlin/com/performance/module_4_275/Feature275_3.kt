package com.performance.module_4_275

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_275.R
import kotlinx.coroutines.launch
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_251.Feature251Repository

class Feature275Fragment : Fragment() {
    private lateinit var viewModel: Feature275ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_275, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature275ViewModel::class.java]
        
        val repository0 = Feature266Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature251Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
