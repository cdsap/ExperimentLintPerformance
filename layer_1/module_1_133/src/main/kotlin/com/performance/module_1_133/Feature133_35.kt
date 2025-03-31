package com.performance.module_1_133

class Feature133UseCase1(
    private val repository: Feature133Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
