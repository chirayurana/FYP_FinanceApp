package com.chirayu.financeapp.domain.usecase.read_database

import com.chirayu.financeapp.data.local.entity.TransactionDto
import com.chirayu.financeapp.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeeklyExpTransactionUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository.TransactionRepository
) {
    operator fun invoke(): Flow<List<TransactionDto>> {
        return transactionRepository.getWeeklyExpTransaction()
    }
}