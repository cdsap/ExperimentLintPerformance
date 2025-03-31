package com.performance.module_3_178

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_151.Feature151Worker
import com.performance.module_2_133.Feature133Worker
import com.performance.module_2_134.Feature134Worker
import com.performance.module_2_143.Feature143Worker
import com.performance.module_2_149.Feature149Worker
import com.performance.module_2_146.Feature146Worker
import com.performance.module_2_160.Feature160Worker
import com.performance.module_2_158.Feature158Worker
import com.performance.module_2_161.Feature161Worker
import com.performance.module_2_137.Feature137Worker

class Feature178Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature151Worker()
        private val worker1 = Feature133Worker()
        private val worker2 = Feature134Worker()
        private val worker3 = Feature143Worker()
        private val worker4 = Feature149Worker()
        private val worker5 = Feature146Worker()
        private val worker6 = Feature160Worker()
        private val worker7 = Feature158Worker()
        private val worker8 = Feature161Worker()
        private val worker9 = Feature137Worker()


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

class Feature178Worker {
    fun doWork(): String {
        return "Work from Feature 178 Worker"
    }
}
