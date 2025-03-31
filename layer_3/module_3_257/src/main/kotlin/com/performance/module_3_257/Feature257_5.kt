package com.performance.module_3_257

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_238.Feature238Worker
import com.performance.module_2_242.Feature242Worker
import com.performance.module_2_213.Feature213Worker
import com.performance.module_2_212.Feature212Worker
import com.performance.module_2_223.Feature223Worker
import com.performance.module_2_225.Feature225Worker
import com.performance.module_2_230.Feature230Worker
import com.performance.module_2_241.Feature241Worker

class Feature257Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature238Worker()
        private val worker1 = Feature242Worker()
        private val worker2 = Feature213Worker()
        private val worker3 = Feature212Worker()
        private val worker4 = Feature223Worker()
        private val worker5 = Feature225Worker()
        private val worker6 = Feature230Worker()
        private val worker7 = Feature241Worker()


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

class Feature257Worker {
    fun doWork(): String {
        return "Work from Feature 257 Worker"
    }
}
