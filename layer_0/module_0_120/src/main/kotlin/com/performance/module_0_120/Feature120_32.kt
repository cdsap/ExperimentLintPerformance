package com.performance.module_0_120

class Feature120UseCase0(
    private val repository: Feature120Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
