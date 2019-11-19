package buu.informatics.s59160379.mytestapp

import android.app.Application
import timber.log.Timber

class Logging :Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}