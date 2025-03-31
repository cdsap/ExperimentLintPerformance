package com.performance.module_2_161

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_161.R
import kotlinx.coroutines.launch
import com.performance.module_1_107.Feature107Repository
import com.performance.module_1_106.Feature106Repository
import com.performance.module_1_105.Feature105Repository
import com.performance.module_1_120.Feature120Repository
import com.performance.module_1_110.Feature110Repository

class Feature161Fragment : Fragment() {
    private lateinit var viewModel: Feature161ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_161, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature161ViewModel::class.java]
        
        val repository0 = Feature107Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature106Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature105Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature120Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature110Repository()
        lifecycleScope.launch {
            repository4.getData()
        }

    }
}
