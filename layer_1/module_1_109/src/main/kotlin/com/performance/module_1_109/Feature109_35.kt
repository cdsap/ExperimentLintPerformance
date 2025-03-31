package com.performance.module_1_109

class Feature109UseCase1(
    private val repository: Feature109Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
