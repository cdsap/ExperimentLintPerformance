package com.performance.module_4_291

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_291.R
import kotlinx.coroutines.launch
import com.performance.module_3_262.Feature262Repository
import com.performance.module_3_255.Feature255Repository
import com.performance.module_3_244.Feature244Repository
import com.performance.module_3_271.Feature271Repository
import com.performance.module_3_254.Feature254Repository
import com.performance.module_3_246.Feature246Repository
import com.performance.module_3_261.Feature261Repository
import com.performance.module_3_248.Feature248Repository

class Feature291Fragment : Fragment() {
    private lateinit var viewModel: Feature291ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_291, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature291ViewModel::class.java]
        
        val repository0 = Feature262Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature255Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature244Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature271Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature254Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature246Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature261Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature248Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
