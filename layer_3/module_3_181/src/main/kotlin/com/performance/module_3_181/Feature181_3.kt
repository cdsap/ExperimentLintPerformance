package com.performance.module_3_181

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_181.R
import kotlinx.coroutines.launch
import com.performance.module_2_134.Feature134Repository
import com.performance.module_2_144.Feature144Repository
import com.performance.module_2_152.Feature152Repository
import com.performance.module_2_150.Feature150Repository
import com.performance.module_2_140.Feature140Repository
import com.performance.module_2_155.Feature155Repository

class Feature181Fragment : Fragment() {
    private lateinit var viewModel: Feature181ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_181, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature181ViewModel::class.java]
        
        val repository0 = Feature134Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature144Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature152Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature150Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature140Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature155Repository()
        lifecycleScope.launch {
            repository5.getData()
        }

    }
}
