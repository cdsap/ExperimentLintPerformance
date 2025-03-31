package com.performance.module_4_78

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_4_78.R
import kotlinx.coroutines.launch
import com.performance.module_3_57.Feature57Repository
import com.performance.module_3_66.Feature66Repository
import com.performance.module_3_55.Feature55Repository
import com.performance.module_3_71.Feature71Repository
import com.performance.module_3_74.Feature74Repository
import com.performance.module_3_50.Feature50Repository

class Feature78Fragment : Fragment() {
    private lateinit var viewModel: Feature78ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_78, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature78ViewModel::class.java]
        
        val repository0 = Feature57Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature66Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature55Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature71Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature74Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature50Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
