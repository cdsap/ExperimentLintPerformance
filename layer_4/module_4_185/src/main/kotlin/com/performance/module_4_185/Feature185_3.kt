package com.performance.module_4_185

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_185.R
import kotlinx.coroutines.launch
import com.performance.module_3_171.Feature171Repository
import com.performance.module_3_166.Feature166Repository

class Feature185Fragment : Fragment() {
    private lateinit var viewModel: Feature185ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_185, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature185ViewModel::class.java]
        
        val repository0 = Feature171Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature166Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
