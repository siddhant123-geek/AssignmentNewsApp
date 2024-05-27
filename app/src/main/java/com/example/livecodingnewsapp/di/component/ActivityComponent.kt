package com.example.livecodingnewsapp.di.component

import com.example.livecodingnewsapp.di.ActivityScope
import com.example.livecodingnewsapp.di.module.ActivityModule
import com.example.livecodingnewsapp.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}