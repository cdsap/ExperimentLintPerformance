package com.performance.module_2_146

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_96.Feature96Worker
import com.performance.module_1_110.Feature110Worker
import com.performance.module_1_118.Feature118Worker
import com.performance.module_1_121.Feature121Worker
import com.performance.module_1_120.Feature120Worker
import com.performance.module_1_98.Feature98Worker
import com.performance.module_1_93.Feature93Worker
import com.performance.module_1_105.Feature105Worker

class Feature146Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature96Worker()
        private val worker1 = Feature110Worker()
        private val worker2 = Feature118Worker()
        private val worker3 = Feature121Worker()
        private val worker4 = Feature120Worker()
        private val worker5 = Feature98Worker()
        private val worker6 = Feature93Worker()
        private val worker7 = Feature105Worker()


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

class Feature146Worker {
    fun doWork(): String {
        return "Work from Feature 146 Worker"
    }
}
