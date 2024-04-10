package com.chirayu.financeapp.domain.usecase.read_database

import com.chirayu.financeapp.data.local.entity.TransactionDto
import com.chirayu.financeapp.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTransactionByTypeUseCase @Inject constructor(private val repo: TransactionRepository.TransactionRepository) {
    operator fun invoke(transactionType: String): Flow<List<TransactionDto>> {
        return repo.getTransactionByType(transactionType)
    }
}