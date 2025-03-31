package com.performance.module_2_220

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_220.R
import kotlinx.coroutines.launch
import com.performance.module_1_196.Feature196Repository
import com.performance.module_1_157.Feature157Repository
import com.performance.module_1_183.Feature183Repository
import com.performance.module_1_174.Feature174Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_154.Feature154Repository

class Feature220Fragment : Fragment() {
    private lateinit var viewModel: Feature220ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_220, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature220ViewModel::class.java]
        
        val repository0 = Feature196Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature157Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature183Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature174Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature142Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature154Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
