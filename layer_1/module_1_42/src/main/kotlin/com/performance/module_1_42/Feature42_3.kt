package com.performance.module_1_42

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_42.R
import kotlinx.coroutines.launch
import com.performance.module_0_7.Feature7Repository
import com.performance.module_0_4.Feature4Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_14.Feature14Repository

class Feature42Fragment : Fragment() {
    private lateinit var viewModel: Feature42ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_42, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature42ViewModel::class.java]
        
        val repository0 = Feature7Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature4Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature11Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature14Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
