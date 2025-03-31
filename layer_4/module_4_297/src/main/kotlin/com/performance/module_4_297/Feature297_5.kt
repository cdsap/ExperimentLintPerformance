package com.performance.module_4_297

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_268.Feature268Worker
import com.performance.module_3_270.Feature270Worker
import com.performance.module_3_251.Feature251Worker
import com.performance.module_3_271.Feature271Worker
import com.performance.module_3_273.Feature273Worker
import com.performance.module_3_265.Feature265Worker
import com.performance.module_3_247.Feature247Worker
import com.performance.module_3_258.Feature258Worker
import com.performance.module_3_259.Feature259Worker
import com.performance.module_3_254.Feature254Worker
import com.performance.module_3_269.Feature269Worker

class Feature297Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature268Worker()
        private val worker1 = Feature270Worker()
        private val worker2 = Feature251Worker()
        private val worker3 = Feature271Worker()
        private val worker4 = Feature273Worker()
        private val worker5 = Feature265Worker()
        private val worker6 = Feature247Worker()
        private val worker7 = Feature258Worker()
        private val worker8 = Feature259Worker()
        private val worker9 = Feature254Worker()
        private val worker10 = Feature269Worker()


    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START)
        startWork()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        worker0.doWork()
        worker1.doWork()
        worker2.doWork()
        worker3.doWork()
        worker4.doWork()
        worker5.doWork()
        worker6.doWork()
        worker7.doWork()
        worker8.doWork()
        worker9.doWork()
        worker10.doWork()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        super.onDestroy()
    }

    override val lifecycle: Lifecycle
        get() = lifecycleRegistry

    private fun startWork() {
        // Service work implementation
    }
}

class Feature297Worker {
    fun doWork(): String {
        return "Work from Feature 297 Worker"
    }
}
