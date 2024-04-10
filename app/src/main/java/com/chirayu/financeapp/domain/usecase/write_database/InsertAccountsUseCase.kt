package com.chirayu.financeapp.domain.usecase.write_database

import com.chirayu.financeapp.data.local.entity.AccountDto
import com.chirayu.financeapp.repository.TransactionRepository
import javax.inject.Inject

class InsertAccountsUseCase @Inject constructor(private val repo: TransactionRepository.TransactionRepository) {

    suspend operator fun invoke(account: List<AccountDto>) {
        repo.insertAccount(account)
    }
}