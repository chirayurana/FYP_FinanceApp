package com.chirayu.financeapp.domain.models


data class CurrencyModel(
    val country: String = String(),
    val currencyCode: String = String(),
    val currencySymbol: String = String()
)
