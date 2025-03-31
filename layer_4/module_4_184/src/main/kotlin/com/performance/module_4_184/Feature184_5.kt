package com.performance.module_4_184

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_3_165.Feature165Worker
import com.performance.module_3_170.Feature170Worker
import com.performance.module_3_176.Feature176Worker
import com.performance.module_3_179.Feature179Worker
import com.performance.module_3_163.Feature163Worker
import com.performance.module_3_178.Feature178Worker

class Feature184Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature165Worker()
        private val worker1 = Feature170Worker()
        private val worker2 = Feature176Worker()
        private val worker3 = Feature179Worker()
        private val worker4 = Feature163Worker()
        private val worker5 = Feature178Worker()


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

class Feature184Worker {
    fun doWork(): String {
        return "Work from Feature 184 Worker"
    }
}
