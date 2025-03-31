package com.performance.module_2_136

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_136.R
import kotlinx.coroutines.launch
import com.performance.module_1_114.Feature114Repository
import com.performance.module_1_101.Feature101Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_99.Feature99Repository
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_103.Feature103Repository
import com.performance.module_1_118.Feature118Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_97.Feature97Repository
import com.performance.module_1_129.Feature129Repository
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_89.Feature89Repository
import com.performance.module_1_117.Feature117Repository
import com.performance.module_1_122.Feature122Repository
import com.performance.module_1_109.Feature109Repository
import com.performance.module_1_96.Feature96Repository

class Feature136Fragment : Fragment() {
    private lateinit var viewModel: Feature136ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_136, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature136ViewModel::class.java]
        
        val repository0 = Feature114Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature101Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature95Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature99Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature102Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature103Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature118Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature132Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature97Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature129Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature116Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature89Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature117Repository()
        lifecycleScope.launch {
            repository12.getData()
        }
        val repository13 = Feature122Repository()
        lifecycleScope.launch {
            repository13.getData()
        }
        val repository14 = Feature109Repository()
        lifecycleScope.launch {
            repository14.getData()
        }
        val repository15 = Feature96Repository()
        lifecycleScope.launch {
            repository15.getData()
        }

    }
}
