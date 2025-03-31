package com.performance.module_4_81

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_81.R
import kotlinx.coroutines.launch
import com.performance.module_3_68.Feature68Repository

class Feature81Fragment : Fragment() {
    private lateinit var viewModel: Feature81ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_81, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature81ViewModel::class.java]
        
        val repository0 = Feature68Repository()
        lifecycleScope.launch {
            repository0.getData()
        }

    }
}
