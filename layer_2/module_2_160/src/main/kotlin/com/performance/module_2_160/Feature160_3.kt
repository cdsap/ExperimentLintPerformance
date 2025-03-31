package com.performance.module_2_160

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_160.R
import kotlinx.coroutines.launch
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_104.Feature104Repository
import com.performance.module_1_103.Feature103Repository
import com.performance.module_1_123.Feature123Repository
import com.performance.module_1_96.Feature96Repository

class Feature160Fragment : Fragment() {
    private lateinit var viewModel: Feature160ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_160, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature160ViewModel::class.java]
        
        val repository0 = Feature124Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature93Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature104Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature103Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature123Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature96Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
