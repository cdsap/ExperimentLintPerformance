package com.performance.module_1_110

class Feature110UseCase0(
    private val repository: Feature110Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
