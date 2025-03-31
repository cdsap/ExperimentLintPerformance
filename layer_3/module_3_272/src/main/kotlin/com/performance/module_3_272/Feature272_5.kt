package com.performance.module_3_272

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_209.Feature209Worker
import com.performance.module_2_216.Feature216Worker
import com.performance.module_2_241.Feature241Worker
import com.performance.module_2_226.Feature226Worker
import com.performance.module_2_224.Feature224Worker
import com.performance.module_2_242.Feature242Worker
import com.performance.module_2_212.Feature212Worker
import com.performance.module_2_222.Feature222Worker
import com.performance.module_2_207.Feature207Worker

class Feature272Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature209Worker()
        private val worker1 = Feature216Worker()
        private val worker2 = Feature241Worker()
        private val worker3 = Feature226Worker()
        private val worker4 = Feature224Worker()
        private val worker5 = Feature242Worker()
        private val worker6 = Feature212Worker()
        private val worker7 = Feature222Worker()
        private val worker8 = Feature207Worker()


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

class Feature272Worker {
    fun doWork(): String {
        return "Work from Feature 272 Worker"
    }
}
