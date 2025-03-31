package com.performance.module_5_301

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_4_282.Feature282Worker
import com.performance.module_4_293.Feature293Worker
import com.performance.module_4_278.Feature278Worker
import com.performance.module_4_280.Feature280Worker
import com.performance.module_4_285.Feature285Worker
import com.performance.module_4_287.Feature287Worker
import com.performance.module_4_298.Feature298Worker
import com.performance.module_4_276.Feature276Worker
import com.performance.module_4_297.Feature297Worker
import com.performance.module_4_286.Feature286Worker
import com.performance.module_4_289.Feature289Worker
import com.performance.module_4_296.Feature296Worker
import com.performance.module_4_292.Feature292Worker

class Feature301Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature282Worker()
        private val worker1 = Feature293Worker()
        private val worker2 = Feature278Worker()
        private val worker3 = Feature280Worker()
        private val worker4 = Feature285Worker()
        private val worker5 = Feature287Worker()
        private val worker6 = Feature298Worker()
        private val worker7 = Feature276Worker()
        private val worker8 = Feature297Worker()
        private val worker9 = Feature286Worker()
        private val worker10 = Feature289Worker()
        private val worker11 = Feature296Worker()
        private val worker12 = Feature292Worker()


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

class Feature301Worker {
    fun doWork(): String {
        return "Work from Feature 301 Worker"
    }
}
