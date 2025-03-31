package com.performance.module_3_175

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_175.R
import kotlinx.coroutines.launch
import com.performance.module_2_147.Feature147Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_157.Feature157Repository
import com.performance.module_2_146.Feature146Repository
import com.performance.module_2_145.Feature145Repository
import com.performance.module_2_149.Feature149Repository
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_151.Feature151Repository
import com.performance.module_2_161.Feature161Repository
import com.performance.module_2_160.Feature160Repository
import com.performance.module_2_138.Feature138Repository
import com.performance.module_2_135.Feature135Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_137.Feature137Repository

class Feature175Fragment : Fragment() {
    private lateinit var viewModel: Feature175ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_175, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature175ViewModel::class.java]
        
        val repository0 = Feature147Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature150Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature157Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature146Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature145Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature149Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature134Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature151Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature161Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature160Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature138Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature135Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature144Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature137Repository()
        lifecycleScope.launch {
            repository13.getData()
        }

    }
}
