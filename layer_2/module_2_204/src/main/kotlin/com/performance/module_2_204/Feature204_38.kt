package com.performance.module_2_204

class Feature204UseCase2(
    private val repository: Feature204Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
