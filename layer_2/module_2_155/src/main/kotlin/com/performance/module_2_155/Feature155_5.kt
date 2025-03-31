package com.performance.module_2_155

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_1_109.Feature109Worker
import com.performance.module_1_127.Feature127Worker
import com.performance.module_1_128.Feature128Worker
import com.performance.module_1_110.Feature110Worker
import com.performance.module_1_115.Feature115Worker
import com.performance.module_1_100.Feature100Worker
import com.performance.module_1_112.Feature112Worker
import com.performance.module_1_129.Feature129Worker
import com.performance.module_1_103.Feature103Worker

class Feature155Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature109Worker()
        private val worker1 = Feature127Worker()
        private val worker2 = Feature128Worker()
        private val worker3 = Feature110Worker()
        private val worker4 = Feature115Worker()
        private val worker5 = Feature100Worker()
        private val worker6 = Feature112Worker()
        private val worker7 = Feature129Worker()
        private val worker8 = Feature103Worker()


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

class Feature155Worker {
    fun doWork(): String {
        return "Work from Feature 155 Worker"
    }
}
