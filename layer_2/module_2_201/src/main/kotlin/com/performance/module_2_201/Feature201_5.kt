package com.performance.module_2_201

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_164.Feature164Worker
import com.performance.module_1_194.Feature194Worker
import com.performance.module_1_184.Feature184Worker
import com.performance.module_1_142.Feature142Worker
import com.performance.module_1_138.Feature138Worker
import com.performance.module_1_179.Feature179Worker
import com.performance.module_1_158.Feature158Worker
import com.performance.module_1_144.Feature144Worker
import com.performance.module_1_177.Feature177Worker
import com.performance.module_1_134.Feature134Worker
import com.performance.module_1_153.Feature153Worker

class Feature201Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature164Worker()
        private val worker1 = Feature194Worker()
        private val worker2 = Feature184Worker()
        private val worker3 = Feature142Worker()
        private val worker4 = Feature138Worker()
        private val worker5 = Feature179Worker()
        private val worker6 = Feature158Worker()
        private val worker7 = Feature144Worker()
        private val worker8 = Feature177Worker()
        private val worker9 = Feature134Worker()
        private val worker10 = Feature153Worker()


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

class Feature201Worker {
    fun doWork(): String {
        return "Work from Feature 201 Worker"
    }
}
