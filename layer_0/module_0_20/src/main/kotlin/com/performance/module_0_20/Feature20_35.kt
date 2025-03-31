package com.performance.module_0_20

class Feature20UseCase1(
    private val repository: Feature20Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
