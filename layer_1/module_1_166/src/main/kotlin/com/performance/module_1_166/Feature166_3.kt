package com.performance.module_1_166

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_1_166.R
import kotlinx.coroutines.launch
import com.performance.module_0_87.Feature87Repository
import com.performance.module_0_113.Feature113Repository
import com.performance.module_0_99.Feature99Repository
import com.performance.module_0_58.Feature58Repository
import com.performance.module_0_11.Feature11Repository

class Feature166Fragment : Fragment() {
    private lateinit var viewModel: Feature166ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_166, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature166ViewModel::class.java]
        
        val repository0 = Feature87Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature113Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature99Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature58Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature11Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
