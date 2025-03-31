package com.performance.module_2_154

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_154.R
import kotlinx.coroutines.launch
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_93.Feature93Repository

class Feature154Fragment : Fragment() {
    private lateinit var viewModel: Feature154ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_154, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature154ViewModel::class.java]
        
        val repository0 = Feature115Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature95Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature124Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature110Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature93Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
