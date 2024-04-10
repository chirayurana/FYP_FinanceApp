package com.chirayu.financeapp.domain.usecase.write_database

import com.chirayu.financeapp.repository.TransactionRepository
import javax.inject.Inject

class EraseTransactionUseCase @Inject constructor(
    private val repository: TransactionRepository.TransactionRepository
) {
    operator fun invoke() {
        repository.eraseTransaction()
    }
}