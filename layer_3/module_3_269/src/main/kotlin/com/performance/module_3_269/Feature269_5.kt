package com.performance.module_3_269

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_208.Feature208Worker
import com.performance.module_2_212.Feature212Worker
import com.performance.module_2_221.Feature221Worker
import com.performance.module_2_205.Feature205Worker
import com.performance.module_2_207.Feature207Worker
import com.performance.module_2_224.Feature224Worker
import com.performance.module_2_203.Feature203Worker
import com.performance.module_2_202.Feature202Worker
import com.performance.module_2_228.Feature228Worker

class Feature269Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature208Worker()
        private val worker1 = Feature212Worker()
        private val worker2 = Feature221Worker()
        private val worker3 = Feature205Worker()
        private val worker4 = Feature207Worker()
        private val worker5 = Feature224Worker()
        private val worker6 = Feature203Worker()
        private val worker7 = Feature202Worker()
        private val worker8 = Feature228Worker()


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

class Feature269Worker {
    fun doWork(): String {
        return "Work from Feature 269 Worker"
    }
}
