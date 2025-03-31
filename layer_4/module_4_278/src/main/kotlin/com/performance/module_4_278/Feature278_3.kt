package com.performance.module_4_278

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_278.R
import kotlinx.coroutines.launch
import com.performance.module_3_266.Feature266Repository
import com.performance.module_3_259.Feature259Repository
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_272.Feature272Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_274.Feature274Repository
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_257.Feature257Repository
import com.performance.module_3_258.Feature258Repository
import com.performance.module_3_269.Feature269Repository

class Feature278Fragment : Fragment() {
    private lateinit var viewModel: Feature278ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_278, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature278ViewModel::class.java]
        
        val repository0 = Feature266Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature259Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature265Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature272Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature254Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature262Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature274Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature270Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature257Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature258Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature269Repository()
        lifecycleScope.launch {
            repository10.getData()
        }

    }
}
