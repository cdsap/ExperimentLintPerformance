package com.performance.module_2_209

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_209.R
import kotlinx.coroutines.launch
import com.performance.module_1_167.Feature167Repository
import com.performance.module_1_161.Feature161Repository

class Feature209Fragment : Fragment() {
    private lateinit var viewModel: Feature209ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_209, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature209ViewModel::class.java]
        
        val repository0 = Feature167Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature161Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
