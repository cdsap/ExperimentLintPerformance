package com.performance.module_0_73

class Feature73UseCase2(
    private val repository: Feature73Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
