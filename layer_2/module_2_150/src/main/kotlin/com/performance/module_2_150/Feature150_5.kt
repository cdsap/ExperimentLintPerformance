package com.performance.module_2_150

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_115.Feature115Worker
import com.performance.module_1_121.Feature121Worker
import com.performance.module_1_94.Feature94Worker
import com.performance.module_1_96.Feature96Worker
import com.performance.module_1_107.Feature107Worker

class Feature150Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature115Worker()
        private val worker1 = Feature121Worker()
        private val worker2 = Feature94Worker()
        private val worker3 = Feature96Worker()
        private val worker4 = Feature107Worker()


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

class Feature150Worker {
    fun doWork(): String {
        return "Work from Feature 150 Worker"
    }
}
