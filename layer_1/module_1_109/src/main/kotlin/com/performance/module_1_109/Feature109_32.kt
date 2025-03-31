package com.performance.module_1_109

class Feature109UseCase0(
    private val repository: Feature109Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
