package com.performance.module_2_229

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_229.R
import kotlinx.coroutines.launch
import com.performance.module_1_163.Feature163Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_137.Feature137Repository
import com.performance.module_1_133.Feature133Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_194.Feature194Repository

class Feature229Fragment : Fragment() {
    private lateinit var viewModel: Feature229ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_229, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature229ViewModel::class.java]
        
        val repository0 = Feature163Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature174Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature137Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature133Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature157Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature194Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
