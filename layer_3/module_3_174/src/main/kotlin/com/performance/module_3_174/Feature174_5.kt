package com.performance.module_3_174

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_142.Feature142Worker
import com.performance.module_2_162.Feature162Worker
import com.performance.module_2_145.Feature145Worker
import com.performance.module_2_134.Feature134Worker
import com.performance.module_2_151.Feature151Worker
import com.performance.module_2_155.Feature155Worker
import com.performance.module_2_139.Feature139Worker
import com.performance.module_2_137.Feature137Worker

class Feature174Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature142Worker()
        private val worker1 = Feature162Worker()
        private val worker2 = Feature145Worker()
        private val worker3 = Feature134Worker()
        private val worker4 = Feature151Worker()
        private val worker5 = Feature155Worker()
        private val worker6 = Feature139Worker()
        private val worker7 = Feature137Worker()


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

class Feature174Worker {
    fun doWork(): String {
        return "Work from Feature 174 Worker"
    }
}
