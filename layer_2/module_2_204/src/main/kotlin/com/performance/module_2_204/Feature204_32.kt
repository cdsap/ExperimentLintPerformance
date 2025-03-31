package com.performance.module_2_204

class Feature204UseCase0(
    private val repository: Feature204Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
