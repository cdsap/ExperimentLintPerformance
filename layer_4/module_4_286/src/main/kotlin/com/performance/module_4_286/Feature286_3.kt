package com.performance.module_4_286

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_286.R
import kotlinx.coroutines.launch
import com.performance.module_3_270.Feature270Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_260.Feature260Repository
import com.performance.module_3_256.Feature256Repository

class Feature286Fragment : Fragment() {
    private lateinit var viewModel: Feature286ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_286, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature286ViewModel::class.java]
        
        val repository0 = Feature270Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature244Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature260Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature256Repository()
        lifecycleScope.launch {
            repository3.getData()
        }

    }
}
