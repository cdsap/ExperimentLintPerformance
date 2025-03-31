package com.performance.module_5_301

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.performance.module_5_301.R
import kotlinx.coroutines.launch
import com.performance.module_4_290.Feature290Repository
import com.performance.module_4_286.Feature286Repository
import com.performance.module_4_281.Feature281Repository
import com.performance.module_4_277.Feature277Repository
import com.performance.module_4_296.Feature296Repository
import com.performance.module_4_282.Feature282Repository
import com.performance.module_4_285.Feature285Repository
import com.performance.module_4_298.Feature298Repository
import com.performance.module_4_293.Feature293Repository
import com.performance.module_4_278.Feature278Repository
import com.performance.module_4_289.Feature289Repository
import com.performance.module_4_294.Feature294Repository
import com.performance.module_4_297.Feature297Repository

class Feature301Fragment : Fragment() {
    private lateinit var viewModel: Feature301ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_301, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[Feature301ViewModel::class.java]
        
        val repository0 = Feature290Repository()
        lifecycleScope.launch {
            repository0.getData()
        }
        val repository1 = Feature286Repository()
        lifecycleScope.launch {
            repository1.getData()
        }
        val repository2 = Feature281Repository()
        lifecycleScope.launch {
            repository2.getData()
        }
        val repository3 = Feature277Repository()
        lifecycleScope.launch {
            repository3.getData()
        }
        val repository4 = Feature296Repository()
        lifecycleScope.launch {
            repository4.getData()
        }
        val repository5 = Feature282Repository()
        lifecycleScope.launch {
            repository5.getData()
        }
        val repository6 = Feature285Repository()
        lifecycleScope.launch {
            repository6.getData()
        }
        val repository7 = Feature298Repository()
        lifecycleScope.launch {
            repository7.getData()
        }
        val repository8 = Feature293Repository()
        lifecycleScope.launch {
            repository8.getData()
        }
        val repository9 = Feature278Repository()
        lifecycleScope.launch {
            repository9.getData()
        }
        val repository10 = Feature289Repository()
        lifecycleScope.launch {
            repository10.getData()
        }
        val repository11 = Feature294Repository()
        lifecycleScope.launch {
            repository11.getData()
        }
        val repository12 = Feature297Repository()
        lifecycleScope.launch {
            repository12.getData()
        }

    }
}
