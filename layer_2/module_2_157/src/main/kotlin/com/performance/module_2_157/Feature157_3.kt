package com.performance.module_2_157

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_157.R
import kotlinx.coroutines.launch
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_104.Feature104Repository

class Feature157Fragment : Fragment() {
    private lateinit var viewModel: Feature157ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_157, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature157ViewModel::class.java]
        
        val repository0 = Feature96Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature124Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature104Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
