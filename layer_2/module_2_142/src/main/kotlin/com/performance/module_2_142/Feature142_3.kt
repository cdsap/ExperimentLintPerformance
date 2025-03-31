package com.performance.module_2_142

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_142.R
import kotlinx.coroutines.launch
import com.performance.module_1_126.Feature126Repository

class Feature142Fragment : Fragment() {
    private lateinit var viewModel: Feature142ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_142, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature142ViewModel::class.java]
        
        val repository0 = Feature126Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
