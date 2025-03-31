package com.performance.module_4_83

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_83.R
import kotlinx.coroutines.launch
import com.performance.module_3_54.Feature54Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_49.Feature49Repository

class Feature83Fragment : Fragment() {
    private lateinit var viewModel: Feature83ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_83, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature83ViewModel::class.java]
        
        val repository0 = Feature54Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature55Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature49Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
