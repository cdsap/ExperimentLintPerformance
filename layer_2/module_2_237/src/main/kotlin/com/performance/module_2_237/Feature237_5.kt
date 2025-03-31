package com.performance.module_2_237

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_162.Feature162Worker
import com.performance.module_1_136.Feature136Worker
import com.performance.module_1_155.Feature155Worker
import com.performance.module_1_193.Feature193Worker
import com.performance.module_1_157.Feature157Worker
import com.performance.module_1_173.Feature173Worker
import com.performance.module_1_170.Feature170Worker

class Feature237Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature162Worker()
        private val worker1 = Feature136Worker()
        private val worker2 = Feature155Worker()
        private val worker3 = Feature193Worker()
        private val worker4 = Feature157Worker()
        private val worker5 = Feature173Worker()
        private val worker6 = Feature170Worker()


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

class Feature237Worker {
    fun doWork(): String {
        return "Work from Feature 237 Worker"
    }
}
