package com.performance.module_4_281

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_281.R
import kotlinx.coroutines.launch
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_247.Feature247Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_251.Feature251Repository
import com.performance.module_3_250.Feature250Repository
import com.performance.module_3_256.Feature256Repository
import com.performance.module_3_253.Feature253Repository
import com.performance.module_3_267.Feature267Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_258.Feature258Repository

class Feature281Fragment : Fragment() {
    private lateinit var viewModel: Feature281ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_281, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature281ViewModel::class.java]
        
        val repository0 = Feature254Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature274Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature247Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature246Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature251Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature250Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature256Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature253Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature267Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature260Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature268Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature271Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature258Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
