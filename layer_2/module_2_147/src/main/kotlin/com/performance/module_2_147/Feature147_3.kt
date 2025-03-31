package com.performance.module_2_147

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_147.R
import kotlinx.coroutines.launch
import com.performance.module_1_124.Feature124Repository
import com.performance.module_1_132.Feature132Repository
import com.performance.module_1_119.Feature119Repository
import com.performance.module_1_111.Feature111Repository
import com.performance.module_1_103.Feature103Repository
import com.performance.module_1_113.Feature113Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_109.Feature109Repository

class Feature147Fragment : Fragment() {
    private lateinit var viewModel: Feature147ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_147, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature147ViewModel::class.java]
        
        val repository0 = Feature124Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature132Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature119Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature111Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature103Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature113Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature93Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature109Repository()
        lifecycleScope.launch {
            repository7.getData()
        }

    }
}
