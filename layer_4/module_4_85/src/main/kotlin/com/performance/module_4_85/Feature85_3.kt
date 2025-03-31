package com.performance.module_4_85

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_85.R
import kotlinx.coroutines.launch
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_49.Feature49Repository
import com.performance.module_3_58.Feature58Repository
import com.performance.module_3_71.Feature71Repository
import com.performance.module_3_59.Feature59Repository
import com.performance.module_3_67.Feature67Repository

class Feature85Fragment : Fragment() {
    private lateinit var viewModel: Feature85ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_85, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature85ViewModel::class.java]
        
        val repository0 = Feature74Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature55Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature49Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature58Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature71Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature59Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature67Repository()
        lifecycleScope.launch {
            repository6.getData()
        }

    }
}
