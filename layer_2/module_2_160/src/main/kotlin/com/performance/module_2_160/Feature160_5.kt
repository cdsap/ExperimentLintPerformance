package com.performance.module_2_160

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_102.Feature102Worker
import com.performance.module_1_103.Feature103Worker
import com.performance.module_1_96.Feature96Worker
import com.performance.module_1_132.Feature132Worker
import com.performance.module_1_123.Feature123Worker
import com.performance.module_1_95.Feature95Worker

class Feature160Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature102Worker()
        private val worker1 = Feature103Worker()
        private val worker2 = Feature96Worker()
        private val worker3 = Feature132Worker()
        private val worker4 = Feature123Worker()
        private val worker5 = Feature95Worker()


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

class Feature160Worker {
    fun doWork(): String {
        return "Work from Feature 160 Worker"
    }
}
