package com.performance.module_2_242

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_242.R
import kotlinx.coroutines.launch
import com.performance.module_1_152.Feature152Repository
import com.performance.module_1_142.Feature142Repository
import com.performance.module_1_148.Feature148Repository

class Feature242Fragment : Fragment() {
    private lateinit var viewModel: Feature242ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_242, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature242ViewModel::class.java]
        
        val repository0 = Feature152Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature142Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature148Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
