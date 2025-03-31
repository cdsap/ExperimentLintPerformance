package com.performance.module_1_152

class Feature152UseCase2(
    private val repository: Feature152Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
