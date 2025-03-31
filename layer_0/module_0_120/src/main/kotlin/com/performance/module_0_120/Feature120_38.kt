package com.performance.module_0_120

class Feature120UseCase2(
    private val repository: Feature120Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
