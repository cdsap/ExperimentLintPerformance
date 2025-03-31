package com.performance.module_0_73

class Feature73UseCase0(
    private val repository: Feature73Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
