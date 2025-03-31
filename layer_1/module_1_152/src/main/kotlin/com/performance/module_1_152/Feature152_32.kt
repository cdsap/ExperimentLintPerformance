package com.performance.module_1_152

class Feature152UseCase0(
    private val repository: Feature152Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
