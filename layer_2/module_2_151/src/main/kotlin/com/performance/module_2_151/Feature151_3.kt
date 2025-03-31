package com.performance.module_2_151

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_151.R
import kotlinx.coroutines.launch
import com.performance.module_1_111.Feature111Repository
import com.performance.module_1_98.Feature98Repository
import com.performance.module_1_106.Feature106Repository
import com.performance.module_1_92.Feature92Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_96.Feature96Repository

class Feature151Fragment : Fragment() {
    private lateinit var viewModel: Feature151ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_151, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature151ViewModel::class.java]
        
        val repository0 = Feature111Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature98Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature106Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature92Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature115Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature96Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
