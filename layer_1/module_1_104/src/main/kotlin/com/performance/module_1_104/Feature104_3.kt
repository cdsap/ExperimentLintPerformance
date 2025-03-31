package com.performance.module_1_104

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_104.R
import kotlinx.coroutines.launch
import com.performance.module_0_54.Feature54Repository
import com.performance.module_0_11.Feature11Repository
import com.performance.module_0_10.Feature10Repository

class Feature104Fragment : Fragment() {
    private lateinit var viewModel: Feature104ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_104, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature104ViewModel::class.java]
        
        val repository0 = Feature54Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature11Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature10Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
