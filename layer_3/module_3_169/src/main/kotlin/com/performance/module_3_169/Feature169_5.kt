package com.performance.module_3_169

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_153.Feature153Worker
import com.performance.module_2_160.Feature160Worker
import com.performance.module_2_144.Feature144Worker
import com.performance.module_2_162.Feature162Worker
import com.performance.module_2_140.Feature140Worker
import com.performance.module_2_138.Feature138Worker
import com.performance.module_2_143.Feature143Worker
import com.performance.module_2_161.Feature161Worker

class Feature169Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature153Worker()
        private val worker1 = Feature160Worker()
        private val worker2 = Feature144Worker()
        private val worker3 = Feature162Worker()
        private val worker4 = Feature140Worker()
        private val worker5 = Feature138Worker()
        private val worker6 = Feature143Worker()
        private val worker7 = Feature161Worker()


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

class Feature169Worker {
    fun doWork(): String {
        return "Work from Feature 169 Worker"
    }
}
