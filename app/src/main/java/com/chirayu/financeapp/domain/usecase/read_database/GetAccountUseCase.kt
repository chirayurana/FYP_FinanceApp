package com.chirayu.financeapp.domain.usecase.read_database

import com.chirayu.financeapp.data.local.entity.AccountDto
import com.chirayu.financeapp.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountUseCase @Inject constructor(private val repo: TransactionRepository.TransactionRepository) {

    operator fun invoke(account: String): Flow<AccountDto> {
        return repo.getAccount(account)
    }
}