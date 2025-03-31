package com.performance.module_4_80

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_80.R
import kotlinx.coroutines.launch
import com.performance.module_3_69.Feature69Repository
import com.performance.module_3_70.Feature70Repository
import com.performance.module_3_71.Feature71Repository

class Feature80Fragment : Fragment() {
    private lateinit var viewModel: Feature80ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_80, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature80ViewModel::class.java]
        
        val repository0 = Feature69Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature70Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature71Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
