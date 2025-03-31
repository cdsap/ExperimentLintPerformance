package com.performance.module_4_294

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_294.R
import kotlinx.coroutines.launch
import com.performance.module_3_243.Feature243Repository
import com.performance.module_3_265.Feature265Repository
import com.performance.module_3_259.Feature259Repository

class Feature294Fragment : Fragment() {
    private lateinit var viewModel: Feature294ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_294, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature294ViewModel::class.java]
        
        val repository0 = Feature243Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature265Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature259Repository()
        lifecycleScope.launch {
            repository2.getData()
        }

    }
}
