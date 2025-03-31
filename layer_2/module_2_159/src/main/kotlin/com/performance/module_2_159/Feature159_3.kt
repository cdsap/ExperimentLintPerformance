package com.performance.module_2_159

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_159.R
import kotlinx.coroutines.launch
import com.performance.module_1_92.Feature92Repository
import com.performance.module_1_118.Feature118Repository

class Feature159Fragment : Fragment() {
    private lateinit var viewModel: Feature159ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_159, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature159ViewModel::class.java]
        
        val repository0 = Feature92Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature118Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
