package com.performance.module_3_166

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_166.R
import kotlinx.coroutines.launch
import com.performance.module_2_155.Feature155Repository
import com.performance.module_2_159.Feature159Repository

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
        
        val repository0 = Feature155Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature159Repository()
        lifecycleScope.launch {
            repository1.getData()
        }

    }
}
