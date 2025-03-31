package com.performance.module_4_279

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_279.R
import kotlinx.coroutines.launch
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_253.Feature253Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_245.Feature245Repository

class Feature279Fragment : Fragment() {
    private lateinit var viewModel: Feature279ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_279, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature279ViewModel::class.java]
        
        val repository0 = Feature243Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature268Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature258Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature262Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature257Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature261Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature259Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature253Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature255Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature245Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
