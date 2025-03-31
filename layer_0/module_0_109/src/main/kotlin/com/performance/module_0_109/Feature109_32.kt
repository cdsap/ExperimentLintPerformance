package com.performance.module_0_109

class Feature109UseCase0(
    private val repository: Feature109Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
