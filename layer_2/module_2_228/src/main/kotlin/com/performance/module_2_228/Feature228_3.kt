package com.performance.module_2_228

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_228.R
import kotlinx.coroutines.launch
import com.performance.module_1_161.Feature161Repository
import com.performance.module_1_138.Feature138Repository
import com.performance.module_1_162.Feature162Repository
import com.performance.module_1_139.Feature139Repository
import com.performance.module_1_164.Feature164Repository
import com.performance.module_1_136.Feature136Repository
import com.performance.module_1_190.Feature190Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_137.Feature137Repository

class Feature228Fragment : Fragment() {
    private lateinit var viewModel: Feature228ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_228, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature228ViewModel::class.java]
        
        val repository0 = Feature161Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature138Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature162Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature139Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature164Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature136Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature190Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature183Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature137Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
