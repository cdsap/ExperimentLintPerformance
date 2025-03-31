package com.performance.module_0_109

class Feature109UseCase2(
    private val repository: Feature109Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
