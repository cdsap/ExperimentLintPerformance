package com.performance.module_4_76

class Feature76UseCase0(
    private val repository: Feature76Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
