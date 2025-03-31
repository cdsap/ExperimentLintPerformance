package com.performance.module_4_86

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_86.R
import kotlinx.coroutines.launch
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_57.Feature57Repository
import com.performance.module_3_64.Feature64Repository

class Feature86Fragment : Fragment() {
    private lateinit var viewModel: Feature86ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_86, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature86ViewModel::class.java]
        
        val repository0 = Feature68Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature57Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature64Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
