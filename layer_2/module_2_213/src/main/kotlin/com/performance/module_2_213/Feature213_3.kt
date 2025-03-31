package com.performance.module_2_213

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_213.R
import kotlinx.coroutines.launch
import com.performance.module_1_198.Feature198Repository

class Feature213Fragment : Fragment() {
    private lateinit var viewModel: Feature213ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_213, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature213ViewModel::class.java]
        
        val repository0 = Feature198Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
