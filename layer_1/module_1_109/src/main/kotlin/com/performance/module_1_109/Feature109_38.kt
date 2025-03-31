package com.performance.module_1_109

class Feature109UseCase2(
    private val repository: Feature109Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
