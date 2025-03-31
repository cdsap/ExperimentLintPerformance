package com.performance.module_1_152

class Feature152UseCase1(
    private val repository: Feature152Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
