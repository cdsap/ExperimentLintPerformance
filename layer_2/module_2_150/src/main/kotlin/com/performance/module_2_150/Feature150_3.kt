package com.performance.module_2_150

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_150.R
import kotlinx.coroutines.launch
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_94.Feature94Repository
import com.performance.module_1_107.Feature107Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_121.Feature121Repository

class Feature150Fragment : Fragment() {
    private lateinit var viewModel: Feature150ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_150, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature150ViewModel::class.java]
        
        val repository0 = Feature102Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature94Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature107Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature109Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature121Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
