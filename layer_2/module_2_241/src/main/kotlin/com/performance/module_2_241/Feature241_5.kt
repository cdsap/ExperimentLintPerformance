package com.performance.module_2_241

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_197.Feature197Worker
import com.performance.module_1_182.Feature182Worker
import com.performance.module_1_178.Feature178Worker
import com.performance.module_1_135.Feature135Worker
import com.performance.module_1_158.Feature158Worker
import com.performance.module_1_154.Feature154Worker
import com.performance.module_1_163.Feature163Worker
import com.performance.module_1_142.Feature142Worker

class Feature241Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature197Worker()
        private val worker1 = Feature182Worker()
        private val worker2 = Feature178Worker()
        private val worker3 = Feature135Worker()
        private val worker4 = Feature158Worker()
        private val worker5 = Feature154Worker()
        private val worker6 = Feature163Worker()
        private val worker7 = Feature142Worker()


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

class Feature241Worker {
    fun doWork(): String {
        return "Work from Feature 241 Worker"
    }
}
