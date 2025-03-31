package com.performance.module_4_277

class Feature277UseCase2(
    private val repository: Feature277Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
