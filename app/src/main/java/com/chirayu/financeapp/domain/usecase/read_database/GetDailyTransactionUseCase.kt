package com.chirayu.financeapp.domain.usecase.read_database

import com.chirayu.financeapp.data.local.entity.TransactionDto
import com.chirayu.financeapp.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDailyTransactionUseCase @Inject constructor(private val repo: TransactionRepository.TransactionRepository) {

    operator fun invoke(entryDate: String): Flow<List<TransactionDto>?> {
        return repo.getDailyTransaction(entryDate)
    }
}