package com.performance.module_4_75

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_75.R
import kotlinx.coroutines.launch
import com.performance.module_3_68.Feature68Repository
import com.performance.module_3_69.Feature69Repository
import com.performance.module_3_60.Feature60Repository
import com.performance.module_3_64.Feature64Repository
import com.performance.module_3_61.Feature61Repository
import com.performance.module_3_63.Feature63Repository
import com.performance.module_3_51.Feature51Repository
import com.performance.module_3_71.Feature71Repository
import com.performance.module_3_50.Feature50Repository

class Feature75Fragment : Fragment() {
    private lateinit var viewModel: Feature75ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_75, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature75ViewModel::class.java]
        
        val repository0 = Feature68Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature69Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature60Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature64Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature61Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature63Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature51Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature71Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature50Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
