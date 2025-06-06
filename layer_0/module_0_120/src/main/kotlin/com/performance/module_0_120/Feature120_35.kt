package com.performance.module_0_120

class Feature120UseCase1(
    private val repository: Feature120Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
