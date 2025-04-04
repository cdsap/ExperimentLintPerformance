package com.performance.module_0_110

class Feature110UseCase1(
    private val repository: Feature110Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
