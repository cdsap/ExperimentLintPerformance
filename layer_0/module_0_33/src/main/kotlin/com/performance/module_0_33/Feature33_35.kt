package com.performance.module_0_33

class Feature33UseCase1(
    private val repository: Feature33Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
