# NewsAppMVVMForAssignment
This is my News Application project, where I have used the frameworks/libraries like dagger, retrofit.

# Architecture used is MVVM(Model View View Model)
![MVVMImage](https://github.com/siddhant123-geek/AssignmentNewsApp/assets/82453362/6e8b338c-7c6c-43e9-aa2f-997679c22a1b)

# Detailed summary of the screens implemented
# TopheadlinesScreen
- Shows a generic list of news from the database which is populated by news fetched from the newsApi.
- And on clicking on each of the news item, we navigate to a more detailed version of the news on browser.
- I have also added the functionality of Long Press DPAD-Down which when performed does a fresh news fetch from the server and shows the updated list.

# TopheadlineScreen
![Screenshot_2024-05-28-22-47-10-50_9b83c5a91e4b1da3d646063e726144ca](https://github.com/siddhant123-geek/AssignmentNewsApp/assets/82453362/8bfdebe3-c6a9-4f5c-8852-958aca03bfaa)
![NewsAppTv1080](https://github.com/siddhant123-geek/AssignmentNewsApp/assets/82453362/fa5739cc-c232-494e-8432-c50b2e6dbe9f)

# Dependencies used 
# Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
# Dagger
    implementation "com.google.dagger:dagger:2.42"
    kapt "com.google.dagger:dagger-compiler:2.42"

# My project structure 
```bash
─main
│   │   AndroidManifest.xml
│   │
│   ├───java
│   │   └───com
│   │       └───example
│   │           └───livecodingnewsapp
│   │               │   NewsApplication.kt
│   │               │
│   │               ├───data
│   │               │   ├───api
│   │               │   │       NetworkService.kt
│   │               │   │
│   │               │   ├───model
│   │               │   │       Article.kt
│   │               │   │       Source.kt
│   │               │   │       TopHeadlineResponse.kt
│   │               │   │
│   │               │   └───repository
│   │               │           TopHeadlineRepository.kt
│   │               │
│   │               ├───di
│   │               │   │   Qualifiers.kt
│   │               │   │   Scopes.kt
│   │               │   │
│   │               │   ├───component
│   │               │   │       ActivityComponent.kt
│   │               │   │       ApplicationComponent.kt
│   │               │   │
│   │               │   └───module
│   │               │           ActivityModule.kt
│   │               │           ApplicationModule.kt
│   │               │
│   │               ├───ui
│   │               │   ├───base
│   │               │   │       UiState.kt
│   │               │   │       ViewModelProviderFactory.kt
│   │               │   │
│   │               │   └───topheadline
│   │               │           TopHeadlineActivity.kt
│   │               │           TopHeadlineAdapter.kt
│   │               │           TopHeadlineViewModel.kt
│   │               │
│   │               └───utils
│   │                       AppConstant.kt
│   │
│   └───res
│       ├───drawable
│       │       ic_launcher_background.xml
│       │       ic_launcher_foreground.xml
│       │
│       ├───layout
│       │       activity_main.xml
│       │       activity_top_headline.xml
│       │       top_headline_item_layout.xml
│       │
│       ├───mipmap-anydpi-v26
│       │       ic_launcher.xml
│       │       ic_launcher_round.xml
│       │
│       ├───mipmap-hdpi
│       │       ic_launcher.webp
│       │       ic_launcher_round.webp
│       │
│       ├───mipmap-mdpi
│       │       ic_launcher.webp
│       │       ic_launcher_round.webp
│       │
│       ├───mipmap-xhdpi
│       │       ic_launcher.webp
│       │       ic_launcher_round.webp
│       │
│       ├───mipmap-xxhdpi
│       │       ic_launcher.webp
│       │       ic_launcher_round.webp
│       │
│       ├───mipmap-xxxhdpi
│       │       ic_launcher.webp
│       │       ic_launcher_round.webp
│       │
│       ├───values
│       │       colors.xml
│       │       strings.xml
│       │       themes.xml
│       │
│       ├───values-night
│       │       themes.xml
│       │
│       └───xml
│               backup_rules.xml
│               data_extraction_rules.xml
│
└───test
    └───java
        └───com
            └───example
                └───livecodingnewsapp
                        ExampleUnitTest.kt
```
