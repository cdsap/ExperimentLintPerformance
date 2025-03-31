package com.performance.module_2_141

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_141.R
import kotlinx.coroutines.launch
import com.performance.module_1_119.Feature119Repository
import com.performance.module_1_110.Feature110Repository
import com.performance.module_1_95.Feature95Repository
import com.performance.module_1_113.Feature113Repository

class Feature141Fragment : Fragment() {
    private lateinit var viewModel: Feature141ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_141, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature141ViewModel::class.java]
        
        val repository0 = Feature119Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature110Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature95Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature113Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
