package com.performance.module_3_269

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_3_269.R
import kotlinx.coroutines.launch
import com.performance.module_2_226.Feature226Repository
import com.performance.module_2_203.Feature203Repository
import com.performance.module_2_228.Feature228Repository
import com.performance.module_2_202.Feature202Repository
import com.performance.module_2_221.Feature221Repository
import com.performance.module_2_207.Feature207Repository
import com.performance.module_2_225.Feature225Repository
import com.performance.module_2_219.Feature219Repository
import com.performance.module_2_241.Feature241Repository

class Feature269Fragment : Fragment() {
    private lateinit var viewModel: Feature269ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_269, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature269ViewModel::class.java]
        
        val repository0 = Feature226Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature203Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature228Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature202Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature221Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature207Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature225Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature219Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature241Repository()
        lifecycleScope.launch {
            repository8.getData()
        }

    }
}
