package com.performance.module_3_263

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_263.R
import kotlinx.coroutines.launch
import com.performance.module_2_211.Feature211Repository
import com.performance.module_2_218.Feature218Repository
import com.performance.module_2_199.Feature199Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_237.Feature237Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_215.Feature215Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_220.Feature220Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_232.Feature232Repository
import com.performance.module_2_200.Feature200Repository

class Feature263Fragment : Fragment() {
    private lateinit var viewModel: Feature263ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_263, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature263ViewModel::class.java]
        
        val repository0 = Feature211Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature218Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature199Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature240Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature237Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature228Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature203Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature215Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature216Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature220Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature225Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature232Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature200Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
