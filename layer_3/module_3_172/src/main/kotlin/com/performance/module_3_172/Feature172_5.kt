package com.performance.module_3_172

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.performance.module_2_136.Feature136Worker
import com.performance.module_2_149.Feature149Worker
import com.performance.module_2_148.Feature148Worker
import com.performance.module_2_152.Feature152Worker
import com.performance.module_2_141.Feature141Worker
import com.performance.module_2_162.Feature162Worker
import com.performance.module_2_139.Feature139Worker
import com.performance.module_2_134.Feature134Worker
import com.performance.module_2_161.Feature161Worker
import com.performance.module_2_154.Feature154Worker
import com.performance.module_2_156.Feature156Worker

class Feature172Service : Service(), LifecycleOwner {
    private val lifecycleRegistry = LifecycleRegistry(this)

    
        private val worker0 = Feature136Worker()
        private val worker1 = Feature149Worker()
        private val worker2 = Feature148Worker()
        private val worker3 = Feature152Worker()
        private val worker4 = Feature141Worker()
        private val worker5 = Feature162Worker()
        private val worker6 = Feature139Worker()
        private val worker7 = Feature134Worker()
        private val worker8 = Feature161Worker()
        private val worker9 = Feature154Worker()
        private val worker10 = Feature156Worker()


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

class Feature172Worker {
    fun doWork(): String {
        return "Work from Feature 172 Worker"
    }
}
