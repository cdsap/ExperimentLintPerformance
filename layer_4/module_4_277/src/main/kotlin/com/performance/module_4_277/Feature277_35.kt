package com.performance.module_4_277

class Feature277UseCase1(
    private val repository: Feature277Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
