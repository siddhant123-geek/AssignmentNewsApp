package com.example.livecodingnewsapp

import android.app.Application
import com.example.livecodingnewsapp.di.component.ApplicationComponent
import com.example.livecodingnewsapp.di.component.DaggerApplicationComponent
import com.example.livecodingnewsapp.di.module.ApplicationModule

class NewsApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}