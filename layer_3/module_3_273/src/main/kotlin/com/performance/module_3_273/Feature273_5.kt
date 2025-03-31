package com.performance.module_3_273

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_231.Feature231Worker
import com.performance.module_2_215.Feature215Worker
import com.performance.module_2_203.Feature203Worker
import com.performance.module_2_242.Feature242Worker
import com.performance.module_2_228.Feature228Worker
import com.performance.module_2_210.Feature210Worker
import com.performance.module_2_216.Feature216Worker
import com.performance.module_2_233.Feature233Worker
import com.performance.module_2_227.Feature227Worker
import com.performance.module_2_206.Feature206Worker
import com.performance.module_2_232.Feature232Worker
import com.performance.module_2_237.Feature237Worker
import com.performance.module_2_211.Feature211Worker
import com.performance.module_2_214.Feature214Worker

class Feature273Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature231Worker()
        private val worker1 = Feature215Worker()
        private val worker2 = Feature203Worker()
        private val worker3 = Feature242Worker()
        private val worker4 = Feature228Worker()
        private val worker5 = Feature210Worker()
        private val worker6 = Feature216Worker()
        private val worker7 = Feature233Worker()
        private val worker8 = Feature227Worker()
        private val worker9 = Feature206Worker()
        private val worker10 = Feature232Worker()
        private val worker11 = Feature237Worker()
        private val worker12 = Feature211Worker()
        private val worker13 = Feature214Worker()


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
        worker13.doWork()
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

class Feature273Worker {
    fun doWork(): String {
        return "Work from Feature 273 Worker"
    }
}
