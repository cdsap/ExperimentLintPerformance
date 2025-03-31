package com.performance.module_3_256

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_256.R
import kotlinx.coroutines.launch
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_212.Feature212Repository
import com.performance.module_2_240.Feature240Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_209.Feature209Repository
import com.performance.module_2_204.Feature204Repository

class Feature256Fragment : Fragment() {
    private lateinit var viewModel: Feature256ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_256, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature256ViewModel::class.java]
        
        val repository0 = Feature225Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature212Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature240Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature219Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature209Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature204Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
