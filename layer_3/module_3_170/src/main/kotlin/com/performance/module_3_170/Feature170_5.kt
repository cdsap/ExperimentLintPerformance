package com.performance.module_3_170

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_144.Feature144Worker
import com.performance.module_2_138.Feature138Worker
import com.performance.module_2_158.Feature158Worker
import com.performance.module_2_154.Feature154Worker
import com.performance.module_2_145.Feature145Worker
import com.performance.module_2_137.Feature137Worker
import com.performance.module_2_133.Feature133Worker
import com.performance.module_2_162.Feature162Worker

class Feature170Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature144Worker()
        private val worker1 = Feature138Worker()
        private val worker2 = Feature158Worker()
        private val worker3 = Feature154Worker()
        private val worker4 = Feature145Worker()
        private val worker5 = Feature137Worker()
        private val worker6 = Feature133Worker()
        private val worker7 = Feature162Worker()


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

class Feature170Worker {
    fun doWork(): String {
        return "Work from Feature 170 Worker"
    }
}
