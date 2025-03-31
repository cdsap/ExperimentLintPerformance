package com.performance.module_2_140

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_2_140.R
import kotlinx.coroutines.launch
import com.performance.module_1_102.Feature102Repository
import com.performance.module_1_96.Feature96Repository
import com.performance.module_1_90.Feature90Repository
import com.performance.module_1_104.Feature104Repository
import com.performance.module_1_112.Feature112Repository
import com.performance.module_1_126.Feature126Repository
import com.performance.module_1_107.Feature107Repository
import com.performance.module_1_115.Feature115Repository
import com.performance.module_1_128.Feature128Repository
import com.performance.module_1_130.Feature130Repository
import com.performance.module_1_89.Feature89Repository
import com.performance.module_1_114.Feature114Repository
import com.performance.module_1_132.Feature132Repository

class Feature140Fragment : Fragment() {
    private lateinit var viewModel: Feature140ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_140, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature140ViewModel::class.java]
        
        val repository0 = Feature102Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature96Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature90Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature104Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature112Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature126Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature107Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature115Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature128Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature130Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature89Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature114Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature132Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
