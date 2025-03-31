package com.performance.module_3_183

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_183.R
import kotlinx.coroutines.launch
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_160.Feature160Repository

class Feature183Fragment : Fragment() {
    private lateinit var viewModel: Feature183ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_183, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature183ViewModel::class.java]
        
        val repository0 = Feature155Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature160Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
