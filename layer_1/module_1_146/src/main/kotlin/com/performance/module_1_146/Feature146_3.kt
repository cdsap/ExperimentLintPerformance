package com.performance.module_1_146

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_146.R
import kotlinx.coroutines.launch
import com.performance.module_0_90.Feature90Repository
import com.performance.module_0_117.Feature117Repository
import com.performance.module_0_103.Feature103Repository
import com.performance.module_0_81.Feature81Repository
import com.performance.module_0_24.Feature24Repository
import com.performance.module_0_35.Feature35Repository
import com.performance.module_0_47.Feature47Repository

class Feature146Fragment : Fragment() {
    private lateinit var viewModel: Feature146ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_146, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature146ViewModel::class.java]
        
        val repository0 = Feature90Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature117Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature103Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature81Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature24Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature35Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature47Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
