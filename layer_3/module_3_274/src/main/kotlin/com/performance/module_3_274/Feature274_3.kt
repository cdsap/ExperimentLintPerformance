package com.performance.module_3_274

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_274.R
import kotlinx.coroutines.launch
import com.performance.module_2_201.Feature201Repository
import com.performance.module_2_216.Feature216Repository
import com.performance.module_2_217.Feature217Repository
import com.performance.module_2_210.Feature210Repository
import com.performance.module_2_236.Feature236Repository
import com.performance.module_2_204.Feature204Repository
import com.performance.module_2_239.Feature239Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_221.Feature221Repository
import com.performance.module_2_213.Feature213Repository
import com.performance.module_2_242.Feature242Repository
import com.performance.module_2_235.Feature235Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_220.Feature220Repository
import com.performance.module_2_240.Feature240Repository

class Feature274Fragment : Fragment() {
    private lateinit var viewModel: Feature274ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_274, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature274ViewModel::class.java]
        
        val repository0 = Feature201Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature216Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature217Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature210Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature236Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature204Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature239Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature219Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature203Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature221Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature213Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature242Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature235Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature212Repository()
        lifecycleScope.launch {
            repository13.getData()
        }
        val repository14 = Feature220Repository()
        lifecycleScope.launch {
            repository14.getData()
        }
        val repository15 = Feature240Repository()
        lifecycleScope.launch {
            repository15.getData()
        }

    }
}
