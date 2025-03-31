package com.performance.module_2_149

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_149.R
import kotlinx.coroutines.launch
import com.performance.module_1_110.Feature110Repository

class Feature149Fragment : Fragment() {
    private lateinit var viewModel: Feature149ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_149, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature149ViewModel::class.java]
        
        val repository0 = Feature110Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
