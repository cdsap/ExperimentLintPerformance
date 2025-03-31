package com.performance.module_5_88

class Feature88UseCase1(
    private val repository: Feature88Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
