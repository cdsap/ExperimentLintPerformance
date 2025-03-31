package com.performance.module_3_260

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_260.R
import kotlinx.coroutines.launch
import com.performance.module_2_223.Feature223Repository
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_206.Feature206Repository
import com.performance.module_2_229.Feature229Repository

class Feature260Fragment : Fragment() {
    private lateinit var viewModel: Feature260ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_260, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature260ViewModel::class.java]
        
        val repository0 = Feature223Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature201Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature240Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature206Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature229Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
