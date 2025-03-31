package com.performance.module_1_192

class Feature192UseCase1(
    private val repository: Feature192Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
