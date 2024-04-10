package com.chirayu.financeapp.domain.usecase.write_datastore

import com.chirayu.financeapp.domain.repository.DatastoreRepository
import javax.inject.Inject

class EraseDatastoreUseCase @Inject constructor(private val datastoreRepository: DatastoreRepository) {
    suspend operator fun invoke() {
        datastoreRepository.eraseDataStore()
    }
}