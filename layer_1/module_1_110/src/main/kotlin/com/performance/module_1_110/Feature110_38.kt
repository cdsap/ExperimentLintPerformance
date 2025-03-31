package com.performance.module_1_110

class Feature110UseCase2(
    private val repository: Feature110Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
