package com.performance.module_5_201

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_4_200.Feature200Worker
import com.performance.module_4_187.Feature187Worker
import com.performance.module_4_188.Feature188Worker
import com.performance.module_4_198.Feature198Worker
import com.performance.module_4_191.Feature191Worker
import com.performance.module_4_193.Feature193Worker
import com.performance.module_4_196.Feature196Worker
import com.performance.module_4_194.Feature194Worker

class Feature201Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature200Worker()
        private val worker1 = Feature187Worker()
        private val worker2 = Feature188Worker()
        private val worker3 = Feature198Worker()
        private val worker4 = Feature191Worker()
        private val worker5 = Feature193Worker()
        private val worker6 = Feature196Worker()
        private val worker7 = Feature194Worker()


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

class Feature201Worker {
    fun doWork(): String {
        return "Work from Feature 201 Worker"
    }
}
