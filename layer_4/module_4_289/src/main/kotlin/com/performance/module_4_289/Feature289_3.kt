package com.performance.module_4_289

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_289.R
import kotlinx.coroutines.launch
import com.performance.module_3_268.Feature268Repository
import com.performance.module_3_245.Feature245Repository

class Feature289Fragment : Fragment() {
    private lateinit var viewModel: Feature289ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_289, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature289ViewModel::class.java]
        
        val repository0 = Feature268Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature245Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
