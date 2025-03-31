package com.performance.module_2_204

class Feature204UseCase1(
    private val repository: Feature204Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
