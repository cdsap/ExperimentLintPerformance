package com.performance.module_3_253

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_235.Feature235Worker
import com.performance.module_2_200.Feature200Worker
import com.performance.module_2_216.Feature216Worker
import com.performance.module_2_220.Feature220Worker
import com.performance.module_2_238.Feature238Worker
import com.performance.module_2_236.Feature236Worker
import com.performance.module_2_212.Feature212Worker
import com.performance.module_2_213.Feature213Worker
import com.performance.module_2_209.Feature209Worker
import com.performance.module_2_225.Feature225Worker
import com.performance.module_2_242.Feature242Worker
import com.performance.module_2_218.Feature218Worker
import com.performance.module_2_217.Feature217Worker

class Feature253Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature235Worker()
        private val worker1 = Feature200Worker()
        private val worker2 = Feature216Worker()
        private val worker3 = Feature220Worker()
        private val worker4 = Feature238Worker()
        private val worker5 = Feature236Worker()
        private val worker6 = Feature212Worker()
        private val worker7 = Feature213Worker()
        private val worker8 = Feature209Worker()
        private val worker9 = Feature225Worker()
        private val worker10 = Feature242Worker()
        private val worker11 = Feature218Worker()
        private val worker12 = Feature217Worker()


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

class Feature253Worker {
    fun doWork(): String {
        return "Work from Feature 253 Worker"
    }
}
