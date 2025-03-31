package com.performance.module_4_189

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_189.R
import kotlinx.coroutines.launch
import com.performance.module_3_182.Feature182Repository
import com.performance.module_3_169.Feature169Repository

class Feature189Fragment : Fragment() {
    private lateinit var viewModel: Feature189ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_189, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature189ViewModel::class.java]
        
        val repository0 = Feature182Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature169Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
