package com.performance.module_0_109

class Feature109UseCase1(
    private val repository: Feature109Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
