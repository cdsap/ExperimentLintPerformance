package com.performance.module_0_110

class Feature110UseCase0(
    private val repository: Feature110Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
