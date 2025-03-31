package com.performance.module_4_76

class Feature76UseCase1(
    private val repository: Feature76Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
