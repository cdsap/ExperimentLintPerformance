package com.performance.module_2_138

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_138.R
import kotlinx.coroutines.launch
import com.performance.module_1_100.Feature100Repository
import com.performance.module_1_116.Feature116Repository
import com.performance.module_1_104.Feature104Repository
import com.performance.module_1_93.Feature93Repository
import com.performance.module_1_111.Feature111Repository
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_126.Feature126Repository
import com.performance.module_1_114.Feature114Repository
import com.performance.module_1_124.Feature124Repository

class Feature138Fragment : Fragment() {
    private lateinit var viewModel: Feature138ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_138, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature138ViewModel::class.java]
        
        val repository0 = Feature100Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature116Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature104Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature93Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature111Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature90Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature126Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature114Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature124Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
