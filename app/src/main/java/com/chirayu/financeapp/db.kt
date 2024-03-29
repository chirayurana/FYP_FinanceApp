package com.chirayu.financeapp

import com.chirayu.financeapp.models.Category
import com.chirayu.financeapp.models.Expense
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

val config = RealmConfiguration.create(schema = setOf(Expense::class, Category::class))
val db: Realm = Realm.open(config)