package com.chirayu.financeapp.domain.models


data class Account(
    val account: String, val amount: Double,
    val income: Double, val expense: Double
)