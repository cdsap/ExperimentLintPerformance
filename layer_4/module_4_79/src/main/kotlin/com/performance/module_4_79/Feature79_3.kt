package com.performance.module_4_79

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_79.R
import kotlinx.coroutines.launch
import com.performance.module_3_67.Feature67Repository
import com.performance.module_3_60.Feature60Repository
import com.performance.module_3_71.Feature71Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_51.Feature51Repository
import com.performance.module_3_73.Feature73Repository
import com.performance.module_3_57.Feature57Repository
import com.performance.module_3_56.Feature56Repository
import com.performance.module_3_72.Feature72Repository
import com.performance.module_3_63.Feature63Repository

class Feature79Fragment : Fragment() {
    private lateinit var viewModel: Feature79ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_79, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature79ViewModel::class.java]
        
        val repository0 = Feature67Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature60Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature71Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature55Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature51Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature73Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature57Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature56Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature72Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature63Repository()
        lifecycleScope.launch {
            repository9.getData()
        }

    }
}
