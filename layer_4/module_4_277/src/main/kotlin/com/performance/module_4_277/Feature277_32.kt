package com.performance.module_4_277

class Feature277UseCase0(
    private val repository: Feature277Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
