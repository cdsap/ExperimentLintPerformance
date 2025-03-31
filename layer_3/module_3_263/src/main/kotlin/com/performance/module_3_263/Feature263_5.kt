package com.performance.module_3_263

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_199.Feature199Worker
import com.performance.module_2_221.Feature221Worker
import com.performance.module_2_235.Feature235Worker
import com.performance.module_2_225.Feature225Worker
import com.performance.module_2_211.Feature211Worker
import com.performance.module_2_224.Feature224Worker
import com.performance.module_2_239.Feature239Worker
import com.performance.module_2_240.Feature240Worker
import com.performance.module_2_220.Feature220Worker
import com.performance.module_2_242.Feature242Worker
import com.performance.module_2_228.Feature228Worker
import com.performance.module_2_209.Feature209Worker
import com.performance.module_2_215.Feature215Worker

class Feature263Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature199Worker()
        private val worker1 = Feature221Worker()
        private val worker2 = Feature235Worker()
        private val worker3 = Feature225Worker()
        private val worker4 = Feature211Worker()
        private val worker5 = Feature224Worker()
        private val worker6 = Feature239Worker()
        private val worker7 = Feature240Worker()
        private val worker8 = Feature220Worker()
        private val worker9 = Feature242Worker()
        private val worker10 = Feature228Worker()
        private val worker11 = Feature209Worker()
        private val worker12 = Feature215Worker()


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
        worker11.doWork()
        worker12.doWork()
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

class Feature263Worker {
    fun doWork(): String {
        return "Work from Feature 263 Worker"
    }
}
