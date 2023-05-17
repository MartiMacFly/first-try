package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    //val computer : Computer = Component().createComputer()
    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var memory: Memory

    //val key1board : Keyboard = DaggerNewComponent.create().getKeyboard()

    init {
        DaggerNewComponent.create().injectActivity(this)
    }
}