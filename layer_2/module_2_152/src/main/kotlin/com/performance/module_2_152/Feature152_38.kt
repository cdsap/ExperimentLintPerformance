package com.performance.module_2_152

class Feature152UseCase2(
    private val repository: Feature152Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
